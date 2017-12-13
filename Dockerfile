FROM rounakraj8/jdk-oracle:8u131

ENV PROFILE $PROFILE

RUN mkdir userservice

COPY userservice/target/userservice.jar userservice/

ADD userservice/start.sh /home/

RUN chmod +x /home/start.sh

EXPOSE 8085

CMD ["sh", "-c", "/home/start.sh userservice/userservice.jar"]
