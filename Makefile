#
# Makefile to manage and simplify docker-compose commands

repl:
	docker-compose run --rm --service-ports app start-docker-repl

bash:
	docker-compose run --rm --entrypoint /bin/bash app

build:
	docker build -t keboola/ex-facebook-insights .

run:
	docker run --rm -i -t -v $${PWD}/tmp:/data keboola/ex-facebook-insights
