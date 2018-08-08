#!/bin/bash
set -e

docker pull quay.io/keboola/developer-portal-cli-v2:latest
export REPOSITORY=`docker run --rm  \
    -e KBC_DEVELOPERPORTAL_USERNAME -e KBC_DEVELOPERPORTAL_PASSWORD -e KBC_DEVELOPERPORTAL_URL \
    quay.io/keboola/developer-portal-cli-v2:latest ecr:get-repository ${KBC_DEVELOPERPORTAL_VENDOR} ${KBC_DEVELOPERPORTAL_APP_1}`
docker tag ${KBC_APP_REPOSITORY}:latest ${REPOSITORY}:${TRAVIS_TAG}
docker tag ${KBC_APP_REPOSITORY}:latest ${REPOSITORY}:latest
eval $(docker run --rm \
    -e KBC_DEVELOPERPORTAL_USERNAME -e KBC_DEVELOPERPORTAL_PASSWORD -e KBC_DEVELOPERPORTAL_URL \
    quay.io/keboola/developer-portal-cli-v2:latest ecr:get-login ${KBC_DEVELOPERPORTAL_VENDOR} ${KBC_DEVELOPERPORTAL_APP_1})
docker push ${REPOSITORY}:${TRAVIS_TAG}
docker push ${REPOSITORY}:latest

# Deploy to KBC -> update the tag in Keboola Developer Portal (needs $KBC_DEVELOPERPORTAL_VENDOR & $KBC_DEVELOPERPORTAL_APP_1)
docker run --rm -e KBC_DEVELOPERPORTAL_USERNAME -e KBC_DEVELOPERPORTAL_PASSWORD -e KBC_DEVELOPERPORTAL_URL \
    quay.io/keboola/developer-portal-cli-v2:latest update-app-repository ${KBC_DEVELOPERPORTAL_VENDOR} ${KBC_DEVELOPERPORTAL_APP_1} ${TRAVIS_TAG}
docker run --rm -e KBC_DEVELOPERPORTAL_USERNAME -e KBC_DEVELOPERPORTAL_PASSWORD -e KBC_DEVELOPERPORTAL_URL \
    quay.io/keboola/developer-portal-cli-v2:latest update-app-repository ${KBC_DEVELOPERPORTAL_VENDOR} ${KBC_DEVELOPERPORTAL_APP_2} ${TRAVIS_TAG}
docker run --rm -e KBC_DEVELOPERPORTAL_USERNAME -e KBC_DEVELOPERPORTAL_PASSWORD -e KBC_DEVELOPERPORTAL_URL \
    quay.io/keboola/developer-portal-cli-v2:latest update-app-repository ${KBC_DEVELOPERPORTAL_VENDOR} ${KBC_DEVELOPERPORTAL_APP_3} ${TRAVIS_TAG}
