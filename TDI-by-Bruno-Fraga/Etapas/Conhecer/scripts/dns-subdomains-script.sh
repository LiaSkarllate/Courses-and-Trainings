#!/bin/bash
for url in $(cat subdomains.lst);
do
    host $url.$1 | grep "has address"
done
