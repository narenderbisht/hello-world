FROM openjdk:8-jdk-alpine
COPY target/*.jar /tmp
COPY docker-resources/*.sh /tmp
ENV sample.param=docker
EXPOSE 3030
CMD ["/tmp/start.sh"]