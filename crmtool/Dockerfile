# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile and package the application using Maven
RUN ./mvnw clean package -DskipTests

# Set the environment variable for port
ENV PORT=8888

# Expose the application port
EXPOSE 8888

# Run the jar file
CMD ["java", "-jar", "target/crmtool-0.0.1-SNAPSHOT.jar"]
