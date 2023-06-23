FROM openjdk:8
EXPOSE 8080
ADD target/springboot-jenkins-docker-example.jar springboot-jenkins-docker-example.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-docker-example.jar"]