FROM adoptopenjdk/openjdk11-openj9:alpine
ADD target/redhat-0.0.1-SNAPSHOT.jar /myapp/redhat-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT java -jar /myapp/redhat-0.0.1-SNAPSHOT.jar
