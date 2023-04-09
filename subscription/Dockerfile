FROM openjdk:17-jdk-alpine

# usually you pass path to jar and version as variables in CI script
COPY build/libs/subscription-0.0.1-SNAPSHOT.jar subscription.jar

ENTRYPOINT java -jar subscription.jar