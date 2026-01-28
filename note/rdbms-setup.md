# RDBMS Setup

note with PostgreSQL example

# Step 1: Install This Dependency
```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'org.postgresql:postgresql'
}
```

# Step 2: Configure Application Properties
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/db_snippets # your connection url
    username: postgres # your database username
    password: postgres # your database password
  jpa:
    hibernate:
      ddl-auto: update
    database: PostgreSQL # your database type
```
