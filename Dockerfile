FROM openjdk:17-oracle
LABEL authors="coasterleung"

VOLUME /tmp

ADD hsbcbook-0.1.0-SNAPSHOT.jar /app.jar
ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms512m -Xmx512m"
EXPOSE 8848

CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar app.jar