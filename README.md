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
| SL 	| Endpoint                                    	| Request Type 	| Data Format in Request Body                                                                                                                                                                                                                        	|
|----	|---------------------------------------------	|--------------	|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| 1  	| host/customermaster                         	| POST         	|  ``` { 	     "data":{ 		       "type":"customer", 		       "attributes":{ 			         "id": 1, 			         "customerId": 1, 			         "amount": 100.20, 			         "lastTransactionDate": 100 		       } 	     } } ```                                              	|
| 2  	| host/customermaster                         	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|
| 3  	| host/customerledger                         	| POST         	| ``` { 	 "data":{ 		     "type":"ledger", 		     "attributes":{ 			       "transactionId": 1, 			       "batchId": 1, 			       "customerId": 1, 			       "transactionType": "credit", 			       "amount": 200000.20, 			       "transactionDate": 201 		     } 	   } }  ``` 	|
| 4  	| host/customerledger/customerId/{customerId} 	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|

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
