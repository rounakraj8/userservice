# Ubuntu base image
FROM ubuntu
MAINTAINER Rounak Raj

#download oracle jdk
COPY /jdk1.8.0_131 /home/jdk1.8.0_131

# set path
ENV JAVA_HOME /home/jdk1.8.0_131

ENV PATH $PATH:$JAVA_HOME/bin

ENV PROFILE $PROFILE

RUN mkdir userservice

COPY userservice/target/userservice.jar userservice/

ADD userservice/start.sh /home/

RUN chmod +x /home/start.sh

EXPOSE 8085

CMD ["sh", "-c", "/home/start.sh userservice/userservice.jar"]
