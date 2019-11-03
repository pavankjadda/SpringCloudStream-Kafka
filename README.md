# SpringCloudStream-Kafka
Kafka with Spring Cloud Stream on Spring Boot
## Introduction
Kafka helps you to build fast, high through put, fault tolerance, scalable microservices and applications. Kafka Streams stores data in Kafka Clusters (Kafka State Stores) and gets data wicket fast. 

This repository demonstrates Kafka with the help of Spring Cloud Stream

## How to Run?
1. Download and install Kafka either from [Confluent](https://docs.confluent.io/current/installation/installing_cp.html#zip-and-tar-archives) or follow instructions [from here](https://www.tutorialspoint.com/apache_kafka/apache_kafka_installation_steps.htm) first. I recommend [Confluent](https://docs.confluent.io/current/installation/installing_cp.html#zip-and-tar-archives) as it combines all the servers into one package with additional tools.
   start kafka with the following command
    ```
    <path-to-confluent>/bin/confluent start
    ```
2. Clone this repository and open in IntelliJ or Eclipse as maven project and run `KafkaStreamApplication` class. This will bring up producer class.
