#!/bin/bash
args=( "$@" )
sleeptime=${args[0]}
echo "start waiting for $sleeptime"
sleep $sleeptime
echo "waiting for $sleeptime is done !"
java -jar ${args[1]}