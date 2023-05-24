FROM openjdk:18-jdk-alpine
COPY ./target/EmployeeManager-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myapp.jar"]
