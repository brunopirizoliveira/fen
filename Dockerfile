FROM openjdk:8

EXPOSE 8095

ARG JAR_FILE

COPY ${JAR_FILE} /data/rocks.jar

CMD ["java", "-jar", "/data/rocks.jar"]