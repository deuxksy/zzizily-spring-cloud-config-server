FROM openjdk:11.0.8-jre-slim
WORKDIR /app
COPY . /app

RUN whereis gradle
RUN chmod +x gradlew
RUN gradlew jar

RUN ls -alh
RUN ls -alh build
RUN ls -alh build/lib

COPY build/libs/*.jar .
ENTRYPOINT ["java", "-jar", "/app/zzizily-spring-cloud-config-server-latest.jar"]
EXPOSE 8888