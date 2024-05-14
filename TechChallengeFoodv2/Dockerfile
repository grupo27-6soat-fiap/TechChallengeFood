FROM openjdk:17.0.2-jdk-oracle

WORKDIR /app

COPY target/* /app/sprin-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]
