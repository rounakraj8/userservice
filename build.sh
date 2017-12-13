#!/bin/bash
source ./config.sh

build(){
	cd $1
	mvn clean install -DskipTests
}

builddocker() {
    cd ..
	docker build -f userservice/Dockerfile -t rounakraj8/userservice .
}

build userservice

#Now building image in config.yml of circleci
#builddocker
