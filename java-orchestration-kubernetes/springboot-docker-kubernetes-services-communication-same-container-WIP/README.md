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
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged Text image with `docker rmi localhost:5000/custom-text-image`
    * Remove tagged Greeting image with `docker rmi localhost:5000/custom-greeting-image`   
    * Remove registry image with `docker rmi registry:2`