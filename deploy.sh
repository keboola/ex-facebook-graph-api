#!/bin/bash

docker login -u="$QUAY_USERNAME" -p="$QUAY_PASSWORD" quay.io
docker tag keboola/ex-facebook-insights quay.io/keboola/ex-facebook-graph-api:$TRAVIS_TAG
docker push quay.io/keboola/ex-facebook-graph-api:$TRAVIS_TAG
