# Use an official Java 17 runtime as the base image
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot executable JAR or WAR file to the container
COPY target/demo-0.0.1-SNAPSHOT.war demo.war

# Expose the port your Spring Boot application will run on (default is 8080)
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "demo.war"]
