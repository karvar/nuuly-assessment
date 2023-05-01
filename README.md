# Nuuly Services Assessment

## What you are given
* docker-compose
  * PostgreSQL
    * A database to track inventory
  * Kafka & ZooKeeper
    * A message broker to handle publishing and subscribing to topics
  * Java gradle application
    * Built with SpringBoot, this is the API server to handle HTTP requests
* Kafka Producer/Consumer Template
  * In `Producer.java` & `Consumer.java` you can utilize those helper functions to send a message and consume a topic
* JPA

## Objective
* Increment the inventory with a purchase order
* Decrement the inventory with a purchase
* When an item is purchased, we want to keep track of the most purchased items
  * To do this, asynchronously produce a message that is consumed by a separate service to track the favorites
* View a list of rankings of most purchased


For more information on the example code provided, view the JavaDocs with:
```shell
./gradlew javadoc && open build/docs/javadoc/index.html
```

## How to start
Run the following to spin up the API server and dependencies
```shell
docker-compose up
```
Test out 

## Requirements

[Install Docker](https://docs.docker.com/engine/installation/)

[Install Docker Compose](https://docs.docker.com/compose/install/)