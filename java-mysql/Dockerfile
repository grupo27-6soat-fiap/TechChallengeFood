FROM openjdk:17
# WORKDIR /java-mysql
COPY  target/accessing-data-mysql-complete-0.0.1-SNAPSHOT.jar techfood.jar
EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "accessing-data-mysql-complete-0.0.1-SNAPSHOT.jar"]
CMD ["java", "-jar", "techfood.jar"]