# userservice
Performs all basic functionalities of a user


This project is simple example of micro-services using Spring Boot implementing basic functionalities related to a user.
It is to create/authenticate/authorize/modify/delete a user.

This application is using docker images and CircleCi for CI/CD.

To pull docker image of this application:

docker pull rounakraj8/userservice

To run this application using pulled docker image:

docker run -d -p 8085:8085 rounakraj8/userservice

To test that application is running successfully:

Go to browser and type http://localhost:8085/status

Cheers, if you get "Userservice is UP" message.


Added snorkell to test


 
