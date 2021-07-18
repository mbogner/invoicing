# Invoicing

This is a simple JEE test app to not loose track on the non Spring Boot track. It is using:

- Java 11
- Maven Wrapper
- Maven Reports
- Wildfly 24
- JPA with named queries in orm.xml
- Flyway
- JAX-RS
- JUnit 5
- AssertJ
- MapStruct
- JPAModelGen
- Lombok
- PostgreSQL

## Microprofile

wildfly microprofile disables ejb support. So the ejb annotations won't work. First point where you will see that is
that the migrations won't run because the Startup bean isn't loaded.
