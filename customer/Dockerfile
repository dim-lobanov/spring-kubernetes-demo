FROM openjdk:17-jdk-alpine

# usually you pass path to jar and version as variables in CI script
COPY build/libs/customer-0.0.1-SNAPSHOT.jar customer.jar

ENTRYPOINT java -jar customer.jar