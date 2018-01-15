#
# Makefile commands to manage and simplify development

DATADIR = ${PWD}/tmp/
FILTER =".*"
-include .fbtokens-env
export

#starts clojure repl in a docker container
repl:
	docker-compose run --rm --service-ports app start-docker-repl

# starts bash in a docker container
bash:
	docker-compose run --rm --entrypoint /bin/bash app

# builds java app jar file - result is targe/project.jar file
build-jar:
	boot build

# build docker image from dockerfile
build-image:
	docker build -t keboola/ex-facebook-graph-api .

# runs extractor docker container - docker-runner command
run-docker:
	docker run --rm -i -t -v $(DATADIR):/data keboola/ex-facebook-graph-api

# runs extractor a compiled jar file as java app. Built via boot build
# command or make build-jar command.
run-jar:
	java -Xmx1g -jar target/ex-fb-graph-api-1.0.jar -d $(DATADIR)

# runs extractor directly from boot ie runs as clojure program
run-boot:
	boot run-extractor --args "-d $(DATADIR)"
regenerate-snapshots:
	boot regenerate-snapshots "-f$(FILTER)"

docker-test:
	docker-compose run app test

# runs jar with visual vm profiler. Needs visualVM to be running with Start up profiler plugin
run-jar-agent:
	java -Xmx256m -agentpath:/Applications/VisualVM.app/Contents/Resources/visualvm/profiler/lib/deployed/jdk16/mac/libprofilerinterface.jnilib=/Applications/VisualVM.app/Contents/Resources/visualvm/profiler/lib,5140 -jar target/ex-fb-graph-api-1.0.jar -d tmp/
rmi:
	-docker rmi -f  $$(docker images -q -f "dangling=true")
rm:
	-docker rm $$(docker ps -q -f 'status=exited')
