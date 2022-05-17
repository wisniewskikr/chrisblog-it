DESCRIPTION
-----------

##### Goal
The goal of this project is to show how to send events from one Spring Boot application (Producer) to other (Consumer) using Apache Kafka broker (type Wurstmeister). All applications are on different Docker Containers. All Docker Containers are run by one single Docker Compose.

Link to **Kafka** theory documentation: https://docs.google.com/document/d/1pDBnFbpvo0mNaIgxLCV--3qUn-wf0vHZiTYRQL05Wes/edit?usp=sharing

##### Details
This project consists of following elements:
1. Two instances of Zookeepers;
2. Two instances of Kafka;
3. Two instances of Producers;
4. Three instances of Consumers.

**Ad 1. Two instances of Zookeepers**

Zookeeper is so called "Service Registry". It has information about location of all elements in an environment. It manages traffic in Kafka - when user sends some event then Zookeeper decides where this event should be redirected. Two Zookeepers does not mean that traffic is faster but it means that if one Zookeeper is down then other still works and whole environment still works.

**Ad 2. Two instances of Kafka**

Kafka is event's broker. It's a middle layer between Producers and Consumers. It handles such elements like partitioning (performance) or replication (security). In this example we have two instances of Kafka. It means that if one will be down then all data will be safe on second instance.

**Ad 3. Two instances of Producers**

Producer is an application which sends events to Consumers via Zookeeper and Kafka. This is Java application based on Spring Boot technology. In Producer you can configure following elements:
* **Topic**: Topic is some kind of "folder" for events; 
* **Topic`s Partition**: Partition is something like "subfolder" for Topic "folder". Goal of Partitions is to speed up performance of Kafka. Partitions for one Topic can be stored in many Kafka Clusters/Brokers. Topic with the same "key" should be stored in the same partition; 
* **Topic`s Replication**: Replication is copy of Partition. Goal of Replication to secure application against data lost. Every Replication is stored in separate Kafka Cluster/Broker. So it means that **count of Replications can not be heigher then count of Clusters/Brokers**;
* **Url**: Producer's Url consists of following variables (all not mandatory variables you can set as "null"):
     * **key**: it's id of event. All events with the same id are automatically stored in the same partition;
    * **value (mandatory)**: it's content of event;    
    * **timestamp**: it's timestamp of event. If it's null then current timestamp is automatically used; 
    * **partition**: it's number of partition where even should be stored. If it's null then partition is assigned automatically by Kafka.
    
In this example we have two instances of Producers:
* **Producer 1**: defined on port **8080** and connected with Topic **greeting-man**. So this Producer should be used to send greeting for a man. This Producer has also two partitions and two replications;
* **Producer 2**: defined on port **8081** and connected with Topic **greeting-woman**. So This Producer should be used to send greeting for a woman. This Producer has also two partitions and two replications.

**Ad 4. Three instances of Consumers**

Consumer is an application which consumes events sent by Producer via Zookeeper and Kafka. This is Java application based on Spring Boot technology. In Consumer you can configure following elements:
* **Topic**: which Topic should be consumed by this specific Consumer;
* **Group Id**: what is id of group this specific Consumer. If Consumers belong to the same group so that means that only one of them will consume one specific event. If Consumers doesn't belong to the same group so that means that every one of them will consume one specific event.
* **Event**: consumed event can consists of following elements:
    * **Group Id**: what is group id of Consumer which consumes this event;
    * **Offset**: what is delay of this event from the beginning;
    * **Key**: this is some kind of event's id;
    * **Partition**: what is partition of this event;
    * **Timestamp**: what is timestamp of this event;
    * **Message**: what is value of this event.

In this example we have three instances of Consumers:
* **Consumer 1**: consumes events connected with Topic **greeting-man**. So all greetings for mans should be displayed here. This Consumer belongs to group **greeting-man-woman**;
* **Consumer 2**: consumes events connected with Topic **greeting-woman**. So all greetings for women should be displayed here. This Consumer belongs to group **greeting-man-woman**;
* **Consumer 3**: consumes events connected with Topics **greeting-man** and **greeting-woman**. So all greetings should be displayed here. This Consumer belongs to group **greeting-human**;

##### Technologies
Used technologies:
* Java
* Maven
* Git
* Spring Boot
* Docker Compose
* Apache Kafka


USAGE
-----

Usage steps:
1. Build packages
2. Start elements using Docker Compose
3. Send messages
4. Read messages
5. Clean up

##### Ad 1\ Build packages
To build packages please open command line console on root folder of this project and type following command:
- **mvn clean package**

##### Ad 2\ Start elements using Docker Compose

To start elements please open command line console on root folder of this project and type following command:
- **docker-compose up --build**

##### Ad 3\ Send messages
To send messages by Producer please use in browser following URL:
- **http://localhost:8080/greeting/partition/{partition}/timestamp/{timestamp}/key/{key}/value/{value}** 

In this example we have two Producers - one for man and one for woman. So example URLs can look like this: 
- http://localhost:8080/greeting/partition/null/timestamp/null/key/greeting/value/John
- http://localhost:8081/greeting/partition/null/timestamp/null/key/greeting/value/Mary

If everything is ok then message **Done** should be displayed in browser.

##### Ad 4\ Read messages
To read the messages please check logs of Consumer application. Following message should be displayed there: 
- **{consumer}   | Event Details: Group Id: {group-id}, Offset: {offset}, Key: {key}, Partition: {partition}, Timestamp: {timestamp}, Message: {message}**

In this example we have three Consumers - one for man, one for woman and one common for both. So displayed messages from example above should look like this:
- consumer3   | Event Details: Group Id: greeting-human, Offset: 0, Key: greeting, Partition: 1, Timestamp: 1645763461681, Message: Hello World John
- consumer1   | Event Details: Group Id: greeting-man-woman, Offset: 0, Key: greeting, Partition: 1, Timestamp: 1645763461681, Message: Hello World John
- consumer3   | Event Details: Group Id: greeting-human, Offset: 0, Key: greeting, Partition: 1, Timestamp: 1645763490716, Message: Hello World Mary
- consumer2   | Event Details: Group Id: greeting-man-woman, Offset: 0, Key: greeting, Partition: 1, Timestamp: 1645763490716, Message: Hello World Mary

##### Ad 5\ Clean up
To clean up applications please in command line press **ctrl + C** and then type **docker-compose down**