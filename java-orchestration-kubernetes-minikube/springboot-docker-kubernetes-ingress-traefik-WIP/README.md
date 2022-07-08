* Create lockal domain: open file **Widnows -> System32 -> drivers -> etc -> hosts** and add there new domain **127.0.0.1 example.net**

* kubectl apply -f traefik.yml
* kubectl apply -f kubernetes.yml
* kubectl apply -f ingress.yml

* kubectl delete namespace helloworld-namespace
* kubectl delete clusterrolebinding traefik-ingress-controller
* kubectl delete clusterrole traefik-ingress-controller