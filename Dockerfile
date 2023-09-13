FROM openjdk:17
WORKDIR /apps
COPY target/service-b-0.0.1.jar .
CMD ["java", "-jar", "service-b-0.0.1.jar"]