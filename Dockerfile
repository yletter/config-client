FROM eclipse-temurin:17-jdk-jammy

COPY target/config-client-0.0.1-SNAPSHOT.jar /tmp/config-client.jar

CMD ["java", "-jar", "/tmp/config-client.jar"]