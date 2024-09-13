FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/crmtool.jar /app/crmtool.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "crmtool.jar"]
