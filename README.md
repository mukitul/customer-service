# customer-service
This README outlines the details of collaborating on this Spring Boot application.

## Prerequisites
* [Docker](), [Git](https://git-scm.com/), [Maven](), [JDK 7 or 8](), [Eclipse or VSCode](), [Postman]()

## Get And Run This Project
Run these commands one by one into cmd/terminal/shell.
* Clone this repository: `git clone https://github.com/mukitul/customer-service.git`
* Get into cloned folder: `cd customer-service`
* Build project: `mvn install` or `mvn clean install` or  `mvn install -DskipTests`
* Run docker compose: `docker-compose up --build -d`
* Visit app at [http://localhost:8084](http://localhost:8084) from browser, explore endpoints using `Postman`.
* For stop all services: `docker-compose down`

## Endpoint Description

| SL 	| Endpoint                                    	| Request Type 	| Data Format in Request Body                                                                                                                                                                                                                        	|
|----	|---------------------------------------------	|--------------	|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
| 1  	| host/customermaster                         	| POST         	|  ``` { 	     "data":{ 		       "type":"customer", 		       "attributes":{ 			         "id": 1, 			         "customerId": 1, 			         "amount": 100.20, 			         "lastTransactionDate": 100 		       } 	     } } ```                                              	|
| 2  	| host/customermaster                         	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|
| 3  	| host/customerledger                         	| POST         	| ``` { 	 "data":{ 		     "type":"ledger", 		     "attributes":{ 			       "transactionId": 1, 			       "batchId": 1, 			       "customerId": 1, 			       "transactionType": "credit", 			       "amount": 200000.20, 			       "transactionDate": 201 		     } 	   } }  ``` 	|
| 4  	| host/customerledger/customerId/{customerId} 	| GET          	| ``` X ```                                                                                                                                                                                                                                          	|

* And some more endpoints are there, explore these endpoints from `controller` classes.

## Short Description
The main purpose of this application is to run `container of this application` with `mysql-container` and `phpmyadmin-container` with a single command.
Here, we mainly explore `docker`, `docker-container networking` and `docker-compose`.




** doc is updating...
