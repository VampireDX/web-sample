FROM openjdk:8-jdk

ADD target/shopfront-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8010

ENTRYPOINT ["java","-jar","/app.jar"]
