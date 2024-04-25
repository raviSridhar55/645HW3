FROM openjdk:17-jdk-alpine
EXPOSE 8080 
COPY target/hw3-0.0.1-SNAPSHOT.jar finalJar.jar
ENTRYPOINT ["java","-jar","/finalJar.jar"]