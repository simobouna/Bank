# MIAGE BANK
Build and run the spring boot server :

```
./mvn install
docker build -t springio/gs-spring-boot-docker .
docker run -p 8080:8080 springio/gs-spring-boot-docker

```
The project is already running on  :

http://178.32.130.54:8080/ 

Contract :

```
GET : 

/transaction/all : Get all transactions

/transaction/id/{id} : Get transactions by Id

/transaction/source/{source} : Get transactions by IBAN source

/transaction/destination/{destination} : Get transactions by IBAN destination

/transaction/devise/{devise} : Get transactions by devise

/transaction/date/{date} : Get transactions by date

POST : 

/transaction/ + json : Add transaction

PUT : 

/transaction/{id} + json : Update transaction

DELETE : 

/transaction/{id} : Delete transaction


GET : 

/compte/{iban} : Get account by IBAN


POST : 

/compte/ + json : Add account

PUT : 

/compte/{iban} + json : Update account

DELETE : 

/compte/{iban} : Delete account

```
