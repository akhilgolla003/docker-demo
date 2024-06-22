FROM openjdk:17-jdk-slim
ADD target/xx-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java","jar","docker-spring-boot.jar"]