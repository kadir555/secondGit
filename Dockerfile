FROM openjdk:11
EXPOSE 8080
ADD target/secondgit.jar secondgit.jar
ENTRYPOINT ["java","-jar","/secondgit.jar"]