# EFK Stack: Logs Beyond Debugging

## Article
Work in progress

## Try it yourself
To setup the EFK stack, just run:
```bash
kubectl create -f kubernetes/namespace
kubectl create -f kubernetes/elastic
kubectl create -f kubernetes/kibana
kubectl create -f kubernetes/fluentd
```

To start the application, run:
```bash
mvn clean package
docker build -t efk:v1 .
kubectl create deployment efk --image=efk:v1 -n efk
kubectl expose deployment efk --type=NodePort --port=8080 -n efk
```

## References
- [Logging in Kubernetes with Elasticsearch, Kibana, and Fluentd](https://mherman.org/blog/logging-in-kubernetes-with-elasticsearch-Kibana-fluentd/)
- [Running Apache Kafka on Minikube](https://technology.amis.nl/platform/kubernetes/running-apache-kafka-on-minikube/)
- [minikube-kafka-cluster](https://github.com/d1egoaz/minikube-kafka-cluster)
- [bitnami-docker-zookeeper](https://github.com/bitnami/bitnami-docker-zookeeper/blob/master/README.md)
- [bitnami-docker-kafka](https://github.com/bitnami/bitnami-docker-kafka/blob/master/README.md)