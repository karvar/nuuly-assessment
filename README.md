# Nuuly Services Assessment

## Objective
* Increment the inventory with a purchase order
* Publish a message to a topic that a garment was purchased
* Consume that message to do the following:
  * Decrements the count of the inventory
  * Tracks the most purchased garments
* View a list of rankings of most purchased garments


## What you are given
* docker-compose
  * Kafka
  * Zookeeper
  * Postgres
* Java gradle application
  * SpringBoot
  * Kafka Template