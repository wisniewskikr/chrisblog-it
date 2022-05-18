DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to check **health** of applications using **actuator** dependency. These applications display **Hello World** message and **port** numbers of **Text** and **Display** services in a **JSON** format in a **browser** using **Java** applications with **Spring Boot** framework.

##### Details
The application displays message "Hello World" and "port" numbers of "Text" and "Display" services in JSON format in a browser. Service "Text" provides text which should be displayed. Service "Display" connects with service "Text" and takes from it text and port and then display it in a browser. These applications also provide health status using actuator dependency. 

##### Launch
To launch this application a user just has to run it via Command Line tool and types specific URL in a browser. Message will be displayed as application response. Also health status will be displayed as application response in a browser.

##### Technologies
This application uses:
* **Spring Boot** framework: framework details: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Java** (tested on version 1.8.0_291). Tool details: `https://docs.google.com/document/d/119VYxF8JIZIUSk7JjwEPNX1RVjHBGbXHBKuK_1ytJg4/edit?usp=sharing`
* Installed **Maven** (tested on version 3.8.5). Tool details: `https://docs.google.com/document/d/1cfIMcqkWlobUfVfTLQp7ixqEcOtoTR8X6OGo3cU4maw/edit?usp=sharing`
* Installed **Git** (tested on version 2.33.0.windows.2). Tool details: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`

##### Preconditions - Actions
* Open **first source code folder** using any **Command Line** tool (for instance "Windonw PowerShell" on Windows OS). To do it please open any Command Line tool in a desired target location and use following commands:
    * Clone Github repository with `git clone https://github.com/wisniewskikr/chrisblog-it.git`
    * Go to source code folder with `cd chrisblog-it\java-springboot\springboot-helloworld-browser-json-ports-actuator-health`
* Open **second source code folder** using any **Command Line** tool (for instance "Windonw PowerShell" on Windows OS) in the same location `springboot-helloworld-browser-json-ports-actuator-health`


USAGE
-----

Usage steps:
1. In the first Command Line tool start application with `mvn -f ./springboot-helloworld-browser-json-ports-text-actuator-health spring-boot:run`
2. In the second Command Line tool start application with `mvn -f ./springboot-helloworld-browser-json-ports-display-actuator-health spring-boot:run`
3. (Optional) Visit `http://localhost:8080`
4. In the first Command Line tool check health status (expected: **{"status":"UP"}** ) with `http://localhost:8080/actuator/health`
5. In the second Command Line tool check health status (expected: **{"status":"UP"}** ) with `http://localhost:9090/actuator/health`
6. Clean up environment:
    * In the first Command Line with `ctrl + C`
    * In the second Command Line with `ctrl + C`