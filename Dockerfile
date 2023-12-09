FROM  eclipse-temurin:17-jdk-alpine

COPY target/Week5_Graded_project-0.0.1-SNAPSHOT.jar /user/app/

WORKDIR /user/app

RUN sh -c 'touch Week5_Graded_project-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Week5_Graded_project-0.0.1-SNAPSHOT.jar"]
