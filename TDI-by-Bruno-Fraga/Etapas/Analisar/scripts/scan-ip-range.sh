#!/bin/bash
echo "Enter a IP range: "
read RANGE
nmap -sP $RANGE | grep for | cut -d " " -f5
