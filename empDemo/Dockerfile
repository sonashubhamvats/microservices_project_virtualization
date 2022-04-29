FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} emp-service.jar
ENTRYPOINT ["java","-jar","/emp-service.jar"]
EXPOSE 8081