FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD goldbergconversion-0.0.1-SNAPSHOT.jar ConversionApp.jar
RUN sh -c 'touch /ConversionApp.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ConversionApp.jar" ]
