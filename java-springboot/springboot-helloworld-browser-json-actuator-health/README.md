DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to check **health** of application using **actuator** dependency. Project also displays **Hello World** message in a **JSON** format in a **browser** by **Java** application using **Spring Boot** framework.

##### Details
The application displays message "Hello World" in a JSON format in a browser. The application also provides health status using actuator dependency.

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
* Open **source code folder** using any **Command Line** tool (for instance "Windonw PowerShell" on Windows OS). To do it please open any Command Line tool in a desired target location and use following commands:
    * Clone Github repository with `git clone https://github.com/wisniewskikr/chrisblog-it.git`
    * Go to source code folder with `cd chrisblog-it\java-springboot\springboot-helloworld-browser-json-actuator-health`


USAGE
-----

Usage steps:
1. Start application with `mvn spring-boot:run`
2. (Optional) Visit `http://localhost:8080`
3. Check health status (expected: **{"status":"UP"}** ) with `http://localhost:8080/actuator/health`
4. Clean up environment with `ctrl + C`