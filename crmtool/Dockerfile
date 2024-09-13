# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/crmtool-0.0.1-SNAPSHOT.jar crmtool.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "crmtool.jar"]
