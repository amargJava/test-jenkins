From openjdk:8
EXPOSE 8080
COPY target/spring-microservice-test-0.0.1-SNAPSHOT.jar spring-microservice-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-microservice-test-0.0.1-SNAPSHOT.jar"]