#!/usr/bin/env bash

set -e
mvn clean package -U -Dmaven.test.skip=false
docker-compose down
docker-compose  up -d --build







