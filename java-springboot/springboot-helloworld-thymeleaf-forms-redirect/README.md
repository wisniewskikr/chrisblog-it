DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to redirect from one **HTML** page with form to other **HTML** page with message in a **browser** by **Java** application using **Spring Boot** and **Thymeleaf** frameworks.

##### Details
The application consists of two HTML pages. First page contains simple form with text field called "Name" and submit button. Second page displays the message "Hello World + {name}". To use this application a user has to fill text field with his/her name and press submit button. Then second page with message will be displayed. 

##### Launch
To launch this application a user just has to run it via Command Line tool and types specific URL in a browser. The initial result page be displayed as application response.

##### Technologies
This application uses:
* **Spring Boot** framework: framework details: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`
* **Thymeleaf** framework: framework details: `https://docs.google.com/document/d/1FTMKfQ5-f6PZ4cW7LSsm5_NeiBgkTe4gzSue2BCX0Lg/edit?usp=sharing`


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
    * Go to source code folder with `cd chrisblog-it\java-springboot\springboot-helloworld-thymeleaf-forms-redirect`


USAGE
-----

Usage steps:
1. Start application with `mvn spring-boot:run`
2. Visit `http://localhost:8080`
3. Clean up environment with `ctrl + C`