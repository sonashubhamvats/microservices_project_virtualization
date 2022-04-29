FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} school-service.jar
ENTRYPOINT ["java","-jar","/school-service.jar"]
EXPOSE 8080