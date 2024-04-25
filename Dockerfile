FROM openjdk:17-jdk-alpine
EXPOSE 8080 
COPY target/demo2-Snap.jar finalJar.jar
ENTRYPOINT ["java","-jar","/finalJar.jar"]