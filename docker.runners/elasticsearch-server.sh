#!/usr/bin/env bash
# Pull image docker automatically
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.5.0
