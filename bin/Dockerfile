FROM openjdk:8-jdk-alpine
EXPOSE 8084
WORKDIR /app
COPY target/customer-service-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "customer-service-0.0.1-SNAPSHOT.jar" ]
