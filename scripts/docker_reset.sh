#!/bin/bash
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" >/dev/null 2>&1 && pwd)"
cd "${DIR}/.." || exit 1

docker compose stop
docker compose rm -f
docker compose up -d
