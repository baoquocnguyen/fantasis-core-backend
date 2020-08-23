# Fantasis Core Backend

For more detail, please visit:
> [Backend Wiki](https://gitlab.com/fantasis-team/fantasis-core-backend/-/wikis/home)

## How to run?

### Update application.properties
```
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=authdb
spring.data.mongodb.user=admin
spring.data.mongodb.password=fantasis

# App Properties
server.port=30288
bezkoder.app.jwtSecret= bezKoderSecretKey
bezkoder.app.jwtExpirationMs= 86400000

# Zipkin info
spring.zipkin.base-url=http://localhost:30732/
spring.sleuth.sampler.probability=1
spring.application.name=core-backend
```

### Start Spring Boot application
```
mvn spring-boot:run
```
