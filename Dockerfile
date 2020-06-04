From openjdk:8
EXPOSE 8080
COPY target/code-test-build.jar code-test-build.jar
ENTRYPOINT ["java","-jar","code-test-build.jar"]