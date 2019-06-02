FROM openjdk:8-alpine

# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

COPY target/springboot-mongo-0.0.1.jar $PROJECT_HOME/springboot-mongo-0.0.1.jar

WORKDIR $PROJECT_HOME

CMD ["java", "-jar", "./springboot-mongo-0.0.1.jar"]