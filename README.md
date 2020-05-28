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

## Get And Run This Project

* `git clone https://github.com/mukitul/customer-service.git`
* `cd customer-service`
* `mvn install` or `mvn clean install` or  `mvn install -DskipTests`
* `docker-compose up --build -d`
* Visit your app at [http://localhost:8084](http://localhost:8084) from browser.
* Explore endpoints using `Postman`.
* For stop all services: `docker-compose down`

## Endpoint Description

| SL 	| Endpoint                                    	| Request Type 	| Data Format in Request Body                                                                                                                                                                                                                        	|
|----	|---------------------------------------------	|--------------	|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| 1  	| host/customermaster                         	| POST         	|  ``` { 	     "data":{ 		       "type":"customer", 		       "attributes":{ 			         "id": 1, 			         "customerId": 1, 			         "amount": 100.20, 			         "lastTransactionDate": 100 		       } 	     } } ```                                              	|
| 2  	| host/customermaster                         	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|
| 3  	| host/customerledger                         	| POST         	| ``` { 	 "data":{ 		     "type":"ledger", 		     "attributes":{ 			       "transactionId": 1, 			       "batchId": 1, 			       "customerId": 1, 			       "transactionType": "credit", 			       "amount": 200000.20, 			       "transactionDate": 201 		     } 	   } }  ``` 	|
| 4  	| host/customerledger/customerId/{customerId} 	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|
