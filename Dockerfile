FROM clojure:boot-2.7.2-alpine
MAINTAINER <tomas.kacur@keboola.com>

# ENV BOOT_JVM_OPTIONS=-Xmx256m
ENV BOOT_CLOJURE_VERSION=1.9.0

ADD . /code
WORKDIR /code
RUN boot build
EXPOSE 1111
ENTRYPOINT ["java", "-jar", "-Xmx1g","target/ex-fb-graph-api-1.0.jar", "-d" , "/data/"]
