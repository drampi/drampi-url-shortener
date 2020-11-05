FROM openjdk:8

ARG version

RUN echo ${version}

ADD build/libs/dasu-api-*.jar dasu-api.jar
ENTRYPOINT ["java", "-jar", "dasu-api.jar"]
