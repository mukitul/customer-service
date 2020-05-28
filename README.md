# customer-service
This README outlines the details of collaborating on this Spring Boot application.
A short introduction of this app could easily go here.

## Prerequisites

You will need the following things properly installed on your computer.
* [Docker]()
* [Git](https://git-scm.com/)
* [Maven]()
* [STS/Eclipse/VSCode]()
* [JDK 7/8]()
* [Google Chrome](https://google.com/chrome/)
* [Postman]()
* [MySQL]()

## Get This Project

* `git clone <repository-url>` this repository
* `cd customer-service`

## Endpoint Description
| SL 	| Endpoint                                    	| Request Type 	| Data Format in Request Body                                                                                                                                                                                                                                                                                                      	|
|----	|---------------------------------------------	|--------------	|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| 1  	| host/customermaster                         	| POST         	| <br>```<br>{<br>	<br>    "data":{<br>		<br>      "type":"customer",<br>		<br>      "attributes":{<br>			<br>        "id": 1,<br>			<br>        "customerId": 1,<br>			<br>        "amount": 100.20,<br>			<br>        "lastTransactionDate": 100<br>		<br>      }<br>	<br>    }<br>}<br>```                                                          	|
| 2  	| host/customermaster                         	| GET          	| ```<br>X<br>```                                                                                                                                                                                                                                                                                                                  	|
| 3  	| host/customerledger                         	| POST         	| ```<br>{<br>	<br>"data":{<br>		<br>    "type":"ledger",<br>		<br>    "attributes":{<br>			<br>      "transactionId": 1,<br>			<br>      "batchId": 1,<br>			<br>      "customerId": 1,<br>			<br>      "transactionType": "credit",<br>			<br>      "amount": 200000.20,<br>			<br>      "transactionDate": 201<br>		<br>    }<br>	<br>  }<br>}<br><br>``` 	|
| 4  	| host/customerledger/customerId/{customerId} 	| GET          	| ```<br>X<br>```                                                                                                                                                                                                                                                                                                                  	|

## Running / Development
#### Maven build with test cases
`mvn install`
or
`mvn clean install`

#### Maven build skipping test cases
`mvn install -DskipTests`

#### What Above commands does?
Above commands will create a jar file in Target folder of application.

#### Run Spring Boot app
```
java -jar Target/customer-service-0.0.1-SNAPSHOT.jar
```

* Visit your app at [http://localhost:8084](http://localhost:8084).
