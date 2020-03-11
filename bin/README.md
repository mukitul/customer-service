# customer-service
This README outlines the details of collaborating on this Spring Boot application.
A short introduction of this app could easily go here.

## Prerequisites

You will need the following things properly installed on your computer.
* [Docker]()
* [Git](https://git-scm.com/)
* [Maven]()
* [STS/Eclipse/VSCode]()
* [Google Chrome](https://google.com/chrome/)
* [Postman]()

## Get This Project

* `git clone <repository-url>` this repository
* `cd customer-service`

## Running / Development
#### Maven build with test cases
```
mvn install
```
or
```
mvn clean install
```

#### Maven build skipping test cases
```
mvn install -DskipTests
```

#### What Above commands does?
Above commands will create a jar file in Target folder of application.

#### Run Spring Boot app
```
java -jar Target/customer-service-0.0.1-SNAPSHOT.jar
```

* Visit your app at [http://localhost:8084](http://localhost:8084).
