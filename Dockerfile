FROM openjdk:11
EXPOSE 8080
ADD target/transport-app-0.0.1-SNAPSHOT.jar transport-app.jar
ENTRYPOINT ["java", "-jar" ,"/transport-app.jar"]