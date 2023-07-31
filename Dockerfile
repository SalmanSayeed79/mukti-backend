FROM sapmachine
EXPOSE 8081
ARG JAR_FILE=target/mukti-backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD [ "java", "-jar",  "/mukti-backend-0.0.1-SNAPSHOT.jar"]
