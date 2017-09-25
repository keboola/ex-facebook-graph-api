FROM openjdk:8
MAINTAINER <tomas.kacur@keboola.com>

# download&install boot
RUN wget -O /usr/bin/boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh \
&& chmod +x /usr/bin/boot

# Setup ENV
ENV JAVA_HOME /opt/java
ENV BOOT_HOME /.boot
ENV BOOT_AS_ROOT yes
ENV BOOT_LOCAL_REPO /m2
ENV BOOT_JVM_OPTIONS=-Xmx256m
ENV BOOT_CLOJURE_VERSION=1.9.0-beta1
ENV BOOT_VERSION=2.7.2

# download & install deps, cache REPL and web deps
RUN boot repl -e '(System/exit 0)' && rm -rf target
ADD . /code
WORKDIR /code
RUN boot build-insights
EXPOSE 1111
ENTRYPOINT ["java", "-jar", "-Xmx1g","targetinsights/exinsights-0.0.1.jar", "-d" , "/data/"]
