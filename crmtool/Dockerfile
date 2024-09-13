FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean package

EXPOSE 8888

CMD ["java", "-jar", "target/crmtool-0.0.1-SNAPSHOT.jar"]
