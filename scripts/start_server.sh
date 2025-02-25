#!/bin/bash
# Stop any existing app process
echo "Stopping existing application..."
pkill -f 'java -jar' || true

# Start new app
echo "Starting new application..."
nohup java -jar /var/app/current/application.jar > /var/log/web-stdout.log 2>&1 &
