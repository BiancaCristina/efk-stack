FROM openjdk:12-alpine

ADD target/efk.jar /app/app.jar

RUN apk update && apk add jq

EXPOSE 8080

CMD java -jar /app/app.jar
