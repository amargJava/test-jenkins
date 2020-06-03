From openjdk:8
EXPOSE 8080
COPY target/spring-microservice-test-0.0.1-SNAPSHOT.jar code-test-build.jar
ENTRYPOINT ["java","-jar","code-test-build.jar"]