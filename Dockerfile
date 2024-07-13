FROM registry.access.redhat.com/ubi8/openjdk-17:latest
COPY target/*.jar /tmp/app.jar
RUN touch /tmp/app.jar
RUN touch /tmp/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]