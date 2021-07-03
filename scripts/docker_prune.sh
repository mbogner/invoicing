#!/bin/bash
echo "###########################"
echo "# clean docker"
echo "###########################"

echo "# stopping containers"
docker stop $(docker ps | awk '{print $1}' | grep -v CONTAINER) >> /dev/null 2>&1

echo "# prune system"
docker system prune -f --volumes >> /dev/null 2>&1

echo "###########################"
echo "# done"
