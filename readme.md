# About the TestApp

The TestApp is designed to respond with "Hello, World!" when it receives a GET request at the URL http://localhost:8080.

## How to run it

### With maven
```
mvn spring-boot:run
```

### With Jar
### Compile it
```
# clean a previous build and make a new JAR
mvn clean package
```
### Run it
```
# run the JAR
java -jar ./target/testing-web-0.0.2.jar.original
```

## Make request to hello world
```
curl http://localhost:8080
```

## How to debug it
```
mvn spring-boot:run --debug
```
## How to test it
```
# run all tests
mvn test
```