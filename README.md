# Spring-Boot-PostgreSQL-Openshift

Demo project for Spring Boot+ Spring DATA JPA+ PostgreSQL + Openshift

- Create postgresql database from [postgresql-persistent-template](https://github.com/openshift/origin/blob/master/examples/db-templates/postgresql-persistent-template.json)

```sh
$ oc new-app https://raw.githubusercontent.com/openshift/origin/master/examples/db-templates/postgresql-persistent-template.json \
  -p POSTGRESQL_USER=testuser \
  -p POSTGRESQL_PASSWORD=test123 \
  -p POSTGRESQL_DATABASE=testdb

```
- Build application and deploy in openshift

```sh
$ mvn clean package

$ mvn fabric8:build fabric8:resource fabric8:deploy

```


### Reference :
- https://github.com/openshift/origin/tree/master/examples/db-templates

- https://docs.openshift.org/latest/using_images/db_images/postgresql.html

- https://maven.fabric8.io/