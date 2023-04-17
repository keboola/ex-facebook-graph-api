FROM clojure:boot-2.8.2-alpine
MAINTAINER <tomas.kacur@keboola.com>

# ENV BOOT_JVM_OPTIONS=-Xmx256m
ENV BOOT_CLOJURE_VERSION=1.11.1

ADD . /code
WORKDIR /code
RUN boot build
RUN chmod a+r target/ex-fb-graph-api-1.0.jar
CMD ["java", "-jar", "-Xmx1g", "-Xrs", "target/ex-fb-graph-api-1.0.jar", "-d", "/data/"]
