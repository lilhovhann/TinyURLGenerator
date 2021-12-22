#!/usr/bin/env bash

set -e
mvn clean package -U -Dmaven.test.skip=true
#mvn -f agent/pom.xml  clean package -U -Dmaven.test.skip=true
docker-compose down
docker-compose  up -d --build







