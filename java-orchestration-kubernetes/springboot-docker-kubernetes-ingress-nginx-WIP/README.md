- https://kubernetes.github.io/ingress-nginx/deploy/
- https://matthewpalmer.net/kubernetes-app-developer/articles/kubernetes-ingress-guide-nginx-example.html
- https://kubernetes.io/docs/concepts/services-networking/ingress/

kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.2.0/deploy/static/provider/cloud/deploy.yaml

kubectl wait --namespace ingress-nginx \
  --for=condition=ready pod \
  --selector=app.kubernetes.io/component=controller \
  --timeout=120s

DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to build and run simple "Hello World" Java Spring Boot application using Kubernetes tool.


##### Details
* More information about Kubernetes tool you can find here: `https://docs.google.com/document/d/1jOsK3Lkbkoq-Xx7Ln9o_ozCt6XpcSElOwu1o2AfQnNc/edit?usp=sharing`
* This example application just displays text: "Hello World".


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker with Kubernetes

##### Preconditions - Actions
* Download Source Code with `git clone https://github.com/wisniewskikr/java-springboot.git`
* Launch Docker with Kubernetes tool on your local machine


USAGE
-----

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build image with `docker build -t greeting-image .`
4. Tag the Docker image with `docker tag greeting-image localhost:5000/greeting-image`
5. Push Docker image to local registry with `docker push localhost:5000/greeting-image`
6. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
7. Check deployment (optional)

    * Display list of deployments with `kubectl get deployments`
    * Display describe for specific deployment with `kubectl describe deployment greeting-deployment`
7. Check pod`s logs (optional)

    * Display list of pods with `kubectl get pods`
    * Display describe for specific pod with `kubectl describe pod <pod_id>`
    * Display log for specific pod with `kubectl logs <pod_id>`
8. Visit `http://localhost:31000`
9. Clean up environment:

    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged image with `docker rmi localhost:5000/greeting-image`
    * Remove image with `docker rmi greeting-image`
    * Remove registry image with `docker rmi registry:2`
