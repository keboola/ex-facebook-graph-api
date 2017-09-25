FROM clojure:boot-2.7.2-alpine
MAINTAINER <tomas.kacur@keboola.com>

# ENV BOOT_JVM_OPTIONS=-Xmx256m
ENV BOOT_CLOJURE_VERSION=1.9.0-beta1

ADD . /code
WORKDIR /code
RUN boot build-insights
EXPOSE 1111
ENTRYPOINT ["java", "-jar", "-Xmx1g","targetinsights/exinsights-0.0.1.jar", "-d" , "/data/"]
