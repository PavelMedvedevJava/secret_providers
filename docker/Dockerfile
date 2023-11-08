FROM openjdk:17
VOLUME /tmp

ADD ./target/secret*.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-Dspring.datasource.url=jdbc:postgresql://db:5432/security","-jar","/app.jar"]
EXPOSE 8082