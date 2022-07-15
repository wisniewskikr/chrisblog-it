kubectl create -f .\traefik-controller.yaml

kubectl delete service hello-service
kubectl delete service traefik-web-ui
kubectl delete pod hello-app
kubectl delete service traefik-ingress-service -n kube-system
kubectl delete deployment traefik-ingress -n kube-system
kubectl delete clusterrole traefik-ingress -n kube-system
kubectl delete clusterrolebinding traefik-ingress -n kube-system
kubectl delete serviceaccount traefik-ingress -n kube-system

---

helm repo add traefik https://helm.traefik.io/traefik
helm repo update
helm install traefik traefik/traefik