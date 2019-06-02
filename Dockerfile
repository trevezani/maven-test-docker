FROM jboss/wildfly:16.0.0.Final
MAINTAINER Alberto Trevezani
RUN mkdir /opt/jboss/wildfly/standalone/configuration/security
COPY target/maven-test-docker.war /opt/jboss/wildfly/standalone/deployments/maven-test-docker.war
HEALTHCHECK --interval=1m --timeout=3s CMD wget --quiet --tries=1 --spider http://localhost:8080/maven-test-docker/api/healthcheck || exit 1