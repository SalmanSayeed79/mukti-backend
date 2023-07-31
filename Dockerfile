FROM sapmachine
EXPOSE 8081
ARG JAR_FILE=target/mukit-backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD [ "java", "-jar",  "/mukit-backend-0.0.1-SNAPSHOT.jar"]