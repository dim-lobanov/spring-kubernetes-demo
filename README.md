# Spring/Docker/Kubernetes microservices example project
..Because I need some template.

## Local
Build each service with Gradle wrapper:
```shell
gradlew project_name:build
```
Local builds use Eureka as a Service discovery server (`eureka-server`).
Eureka disabled for docker and k8s set-ups.

Note that you still need to set up a Postgres database on port 5431 (locally or run a container).

## Docker
To run it via docker containers:

1. Build subprojects as jars with Gradle (`gradlew project_name:build`).
2. Build docker images for services with Dockerfiles. Use prefix `spring-kubernetes-demo/` for images tags.
3. Run `docker-compose -f docker-compose.posgres.yml -f docker-compose.app.yml up -d`

## Kubernetes (minikube)
YAML files for K8s deployment are stored in `kubernetes/minikube` directory.
Components in `infrastructure` should be created first.

Note that:
* minikube don't expose external IP addresses of services by default. You can tunnel it via `minikube service service_with_external_ip`
* minikube don't use *local* docker images by default. You can load image directly with `minikube image load image_name`
