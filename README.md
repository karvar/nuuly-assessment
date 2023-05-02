# Nuuly Services Assessment

## What you are given
* docker-compose
  * PostgreSQL
    * A database to track inventory
  * Kafka & ZooKeeper
    * A message broker to handle publishing and subscribing to topics
    * The configurations for Kafka are handled with the existing application code
  * Java gradle application
    * Built with SpringBoot, this is the API server to handle HTTP requests
* Kafka Producer/Consumer Template
  * In `ProducerService.java` & `Consumer.java` you can utilize those helper functions to send a message and consume a topic
* JPA Databases
  * Two database tables called `Inventory` and `Favorites`
  * These database tables that are auto-created at application start


## Objective
* Create a flow of adding new items to our inventory to be purchased
  * Creating purchase orders will increase the inventory by the amount received
  * Purchasing items will decrease the inventory by the amount requested, if inventory exists
* Allow for reporting on what items were purchased the most/least
  * When an item is purchased, keep track of the most purchased items
  * To do this, asynchronously produce a message that is consumed by a separate service to track the favorites
  * This should be done in a non-blocking manner to purchase requests since we just want this for reporting
* View a list of rankings of most purchased items reported on
* Bonus: Allow for a way to purchase a list of items & amounts instead of one at a time


### Further notes
* Handle responses to the client in a suitable manner
  * Use appropriate HTTP responses and error handling
  * Return a response data to the client about what was updated
* Update existing code documentation to reflect changes made


For more information on the example code provided, view the JavaDocs with:
```bash
./gradlew javadoc && open build/docs/javadoc/index.html
```

## How to start
Run the following to spin up the API server and dependencies
```shell
docker-compose up --build
```

## Requirements

[Install Docker](https://docs.docker.com/engine/installation/)

[Install Docker Compose](https://docs.docker.com/compose/install/)