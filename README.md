# runtime-java-coverage-oozie
Sample Oozie Map Reduce application to capture Dynamic code coverage. 

## Getting Started
This is the sample application demonstrates various options to capture runtime Java coverage for the Hadoop jobs triggered via Oozie workflow.
Java jobs could be either Standalone or MapReduce application, in this example it covers both options.

To get started, you need to clone this project and package it as a jar (com.ravik.oozie.coverage-0.0.1.jar).

```
$ git clone https://github.com/kkravikumar/runtime-java-coverage-oozie.git 
$ mvn package

```

### Prerequisites

Prior to running this application you need to make sure below items are in place. This application tested in hadoop [Cloudera](https://www.cloudera.com/downloads/cdh/5-9-1.html) distribution version 5.9.1

1. A Running Hadoop environment with Oozie service installed.
2. JaCoCo listener to receive the coverage information and write *.exec file.
3. Create test data (any sample file) and place them on HDFS directory '/user/${user}/coverage/input'

### Installing

Packaged jar has to be placed on the HDFS '/user/${user}/coverage/lib' directory and place the Oozie workflow files on '/user/${user}/coverage/' directory.

```
$ hdfs dfs -put com.ravik.oozie.coverage-0.0.1.jar /user/${user}/coverage/
$ jar -xvf com.ravik.oozie.coverage-0.0.1.jar
$ oozie job -oozie http://${hadoopServerName}:11000/oozie -config job-system.properties -run 

```

## Authors

* **Ravikumar Kuppusamy** - *Initial work* - [RaviK](https://github.com/kkravikumar)

