FROM openjdk:8-jdk-alpine
MAINTAINER Shaun.Chow. S.C. <uranus-neptune@hotmail.com>

COPY ./libs/eureka-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/
ENV TZ "Asia/Shanghai"
ENV LANG C.UTF-8

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/eureka-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761


