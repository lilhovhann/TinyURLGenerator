FROM openjdk:11-jdk-slim
COPY target/tiny.jar /opt/tiny.jar
ENTRYPOINT ["java", "-Djava.net.preferIPv4Stack=true", "-jar","/opt/tiny.jar"]
EXPOSE 8004
