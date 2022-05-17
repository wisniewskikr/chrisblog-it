DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to define **application.properties** file as so called **secret** in simple "Hello World" Java Spring Boot application using Kubernetes tool.


##### Details
* Secrets is encrypted external configuration file. It means that only restricted people can see the content and file is not included in application. It's very flexible solution because developer can very easly update these files
* This example application just displays text: "Hello World!". This text is stored in `application.properties` file as three properties. But this file is not stored in resources folder so Spring Boot does not see it by default. You have to mount it using "secret" in Kubernetes tool 
* More information about Kubernetes tool you can find here: `https://docs.google.com/document/d/1jOsK3Lkbkoq-Xx7Ln9o_ozCt6XpcSElOwu1o2AfQnNc/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker with Kubernetes

##### Preconditions - Actions
* Download Source Code with `git clone https://github.com/wisniewskikr/java-springboot.git`
* Launch Docker tool on your local machine


USAGE - YML FILE
----------------

Secret is defined in yml file.

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build image with `docker build -t greeting-image .`
4. Tag the Docker image with `docker tag greeting-image localhost:5000/greeting-image`
5. Push Docker image to local registry with `docker push localhost:5000/greeting-image`
6. Deploy secret to Kubernetes with `kubectl apply -f secret.yml`
7. Check secret (optional)

    * Display list of secrets with `kubectl get secrets`
    * Display describe for specific secret with `kubectl describe secret greeting-secret`
8. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
9. Check deployment (optional)

    * Display list of deployments with `kubectl get deployments`
    * Display describe for specific deployment with `kubectl describe deployment greeting-deployment`
10. Check pod`s logs (optional)

    * Display list of pods with `kubectl get pods`
    * Display describe for specific pod with `kubectl describe pod <pod_id>`
    * Display log for specific pod with `kubectl logs <pod_id>`
11. Visit `http://localhost:31000`
12. Clean up environment:

    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Delete Kubernetes secret with `kubectl delete secret greeting-secret`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged image with `docker rmi localhost:5000/greeting-image`
    * Remove image with `docker rmi greeting-image`
    * Remove registry image with `docker rmi registry:2`
    

USAGE - COMMAND LINE
--------------------

Secret is defined by command in command line.

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build image with `docker build -t greeting-image .`
4. Tag the Docker image with `docker tag greeting-image localhost:5000/greeting-image`
5. Push Docker image to local registry with `docker push localhost:5000/greeting-image`
6. Deploy secret to Kubernetes with `kubectl create secret generic greeting-secret --from-file ./secret/application.properties`
7. Check secret (optional)

    * Display list of secrets with `kubectl get secrets`
    * Display describe for specific secret with `kubectl describe secret greeting-secret`
8. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
9. Check deployment (optional)

    * Display list of deployments with `kubectl get deployments`
    * Display describe for specific deployment with `kubectl describe deployment greeting-deployment`
10. Check pod`s logs (optional)

    * Display list of pods with `kubectl get pods`
    * Display describe for specific pod with `kubectl describe pod <pod_id>`
    * Display log for specific pod with `kubectl logs <pod_id>`
11. Visit `http://localhost:31000`
12. Clean up environment:

    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Delete Kubernetes secret with `kubectl delete secret greeting-secret`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged image with `docker rmi localhost:5000/greeting-image`
    * Remove image with `docker rmi greeting-image`
    * Remove registry image with `docker rmi registry:2`