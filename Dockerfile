FROM eclipse-temurin:21-jdk AS build
COPY . .
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/Server.jar Server.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","Server.jar"]