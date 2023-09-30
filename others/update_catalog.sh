#!/bin/bash

mvn -f helper/pom.xml clean compile exec:java -Dexec.mainClass=GenerateCatalog
