FROM eclipse-temurin:17-jdk-alpine
WORKDIR /opt/app
ARG JAR_FILE=build/libs/app-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/opt/app/app-0.0.1-SNAPSHOT.jar"]

