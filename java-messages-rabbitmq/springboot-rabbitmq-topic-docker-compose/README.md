DESCRIPTION
-----------

##### Goal
The goal of this project is to show how to send JMS messages from one Java Spring Boot application to other using **Rabbit MQ** JMS broker.

**JMS architecture** means that there is no direct connection between client and server. Between them there is element called "broker". Result of such approach is that such architecture is much more flexible - you can use many clients and server (producers and consumers) fot the same event (message).

This example describes how to configure, run, send and read JMS message type **Topic**. It means that one message is sent from one Producer to many Consumers at the same time. Message is deleted when all Customers read it.

All elements of this project - applications, servers etc. - are configured by **Docker** and **Docker Compose**.

##### Details
Project elements:
* **Rabbit MQ server**: JMS broker - tool which enable sending and receiving JMS messages
* **Spring Boot Producer application**: application which sends messages to Rabbit MQ. Two types of messages can be sent here - accessible manually by APi or accessible automatically by Listener in Consumer application
* **Spring Boot Consumer application**: application which receives messages from Rabbit MQ. Two types of message are read here - accessible manually by API or accessible automatically by Listener

##### Technologies
Used technologies:
* Java
* Maven
* Git
* Spring Boot
* Docker
* Docker Compose
* Rabbit MQ


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker (with Docker Compose)

##### Preconditions - Actions
* Start Docker: only if it's not aleady running;
* Download Source Code: only if it hasn't been downloaded yet. Git command: **git clone https://github.com/wisniewskikr/java-messaging.git**


USAGE
-----

Usage steps:
1. Build packages
2. Start elements using Docker Compose
3. Send message
4. Read message
5. Clean up

##### Ad 1\ Build packages
To build packages please open command line console on **root** folder of this project and type following command:
- **mvn clean package**

##### Ad 2\ Start elements using Docker Compose

To start elements please open command line console on root folder of this project and type following command:
- **docker-compose up --build**

##### Ad 3\ Send message
To send message accessible manually by API in Consumer application please put following URL in any browser: 
* **http://localhost:8080/greeting/name/{name}** (for instance: http://localhost:8080/greeting/name/Chris)

After successful action message **Done** should be displayed

##### Ad 4\ Read message
To read messages manually open browser and type there following URL: 
* **http://localhost:9090/greeting/type/api/message**

Message **Hello World {name}** should be displayed. For instance **Hello World Chris**

To see messages read automatically by Consumer's listener please open Consumer console. Message **Hello World {name}** should be displayed. For instance **Hello World Chris**

##### Ad 5\ Clean up
To clean up applications:
- In command line press **ctrl + C** and then type **docker-compose down**
