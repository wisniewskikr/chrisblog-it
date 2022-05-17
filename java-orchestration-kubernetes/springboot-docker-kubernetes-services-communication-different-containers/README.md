DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to **set up communication** between two simple "Hello World" Java Spring Boot applications using Kubernetes tool.


##### Details
* Application **custem-text-service** provides API with text "Hello World** and port number
* Application **custom-greeting-service** provides API with text from "custome-text-service" and both ports - "text" and "greeting" 
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

USAGE
-----

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build Text image with `docker build -t localhost:5000/custom-text-image ./custom-text-service`
4. Push Docker Text image to local registry with `docker push localhost:5000/custom-text-image`
5. Build Greeting image with `docker build -t localhost:5000/custom-greeting-image ./custom-greeting-service`
6. Push Docker Greeting image to local registry with `docker push localhost:5000/custom-greeting-image`
7. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
8. Check deployment (optional)

    * Display list of deployments with `kubectl get deployments`
    * Display describe for specific deployment with `kubectl describe deployment greeting-deployment`
9. Check pod`s logs (optional)

    * Display list of pods with `kubectl get pods`
    * Display describe for specific pod with `kubectl describe pod <pod_id>`
    * Display log for specific pod with `kubectl logs <pod_id>`
10. Visit `http://localhost:31000`
11. Clean up environment:

    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes service with `kubectl delete service text-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Delete Kubernetes deployment with `kubectl delete deployment text-deployment`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged Text image with `docker rmi localhost:5000/custom-text-image`
    * Remove tagged Greeting image with `docker rmi localhost:5000/custom-greeting-image`   
    * Remove registry image with `docker rmi registry:2`