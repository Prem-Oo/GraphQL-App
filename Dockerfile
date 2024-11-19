FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/Boot-GraphQL-1.0.war app.war
ENTRYPOINT ["java","-jar","/app.war"]
