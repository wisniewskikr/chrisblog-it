* helm create springboot-helloworld-helm
* rmdir springboot-helloworld-helm\templates /s
* xcopy source springboot-helloworld-helm /E /H /C /I /Y
* helm template springboot-helloworld-helm springboot-helloworld-helm
* helm install springboot-helloworld-helm springboot-helloworld-helm
* helm list
* http://localhost:31000
* helm uninstall springboot-helloworld-helm
* rmdir springboot-helloworld-helm