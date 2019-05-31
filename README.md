# maven-test-docker
Testing with JUnit 5 and Docker


## Options

Generating the artifacts and the image

`mvn clean package -Pimage -DskipTests`

Generating only the artifacts

`mvn clean package -DskipTests`

Running integration tests

`mvn integration-test`


## Tecnologies in this sample
* Java 8
* JUnit 5
* REST
* Wildfly 16
* Docker