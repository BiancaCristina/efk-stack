# EFK Stack: Logs Beyond Debugging

## Article
- [EFK Stack: Logs Além da Depuração](https://biahyonce.medium.com/efk-stack-logs-al%C3%A9m-da-depura%C3%A7%C3%A3o-672adeed606b)

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
