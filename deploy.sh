#!/bin/bash

docker login -u="$QUAY_USERNAME" -p="$QUAY_PASSWORD" quay.io
docker tag exfacebookgraphapi_app quay.io/keboola/ex-facebook-graph-api:$TRAVIS_TAG
docker push quay.io/keboola/ex-facebook-graph-api:$TRAVIS_TAG
