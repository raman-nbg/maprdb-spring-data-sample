# MapR-DB Spring Data Sample
This is a sample application to demonstrate the usage of
[maprdb-spring-data](https://github.com/raman-nbg/maprdb-spring-data) in a Spring Boot application.
The sample uses the [maprdb-spring-boot-starter](https://github.com/raman-nbg/maprdb-spring-boot-starter).

1. Anotate your App with `@EnableMapRRepository`
2. Create your data model class
  - Add a `@Document` annotation to the class
  - Add a `@Id` annotation to the primary key
3. Extend `MapRRepository` interface
4. Let the Spring Framework do the magic for you...
