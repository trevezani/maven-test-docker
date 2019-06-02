# maven-test-docker
Testing with JUnit 5 and Docker


## Options

Generating only the artifacts

`mvn clean package`

Generating the artifacts and the image

`mvn clean package -Pimage`

Running integration tests

`mvn verify -PrunTests`


## Tecnologies in this sample
* Java 8
* JUnit 5
* REST
* Wildfly 16
* Docker