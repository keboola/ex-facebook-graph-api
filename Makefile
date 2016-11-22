#
# Makefile commands to manage and simplify development

DATADIR = ${PWD}/tmp/

#starts clojure repl in a docker container
repl:
	docker-compose run --rm --service-ports app start-docker-repl

# starts bash in a docker container
bash:
	docker-compose run --rm --entrypoint /bin/bash app

# builds java app jar file - result is targetinsights/project.jar file
build-jar:
	boot build-insights

# build docker image from dockerfile
build-image:
	docker build -t keboola/ex-facebook-insights .

# runs extractor docker container - docker-runner command
run-docker:
	docker run --rm -i -t -v $(DATADIR):/data keboola/ex-facebook-insights

# runs extractor a compiled jar file as java app. Built via boot build
# command or make build-jar command.
run-jar:
	java -Xmx256m -jar targetinsights/project.jar -d $(DATADIR)

# runs extractor directly from boot ie runs as clojure program
run-boot:
	boot run-insights --args "-d $(DATADIR)"


# runs jar with visual vm profiler. Needs visualVM to be running with Start up profiler plugin
run-jar-agent:
	java -Xmx256m -agentpath:/Applications/VisualVM.app/Contents/Resources/visualvm/profiler/lib/deployed/jdk16/mac/libprofilerinterface.jnilib=/Applications/VisualVM.app/Contents/Resources/visualvm/profiler/lib,5140 -jar targetinsights/project.jar -d tmp/
