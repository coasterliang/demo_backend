# instructions
## local run
1. checkout code
2. open in IntelliJ, running maven command

``
mvn clean & install
``

3. check the api result using browser or postman

| feature       | url                                        | method |
|---------------|--------------------------------------------|--------|
| list          | http://127.0.0.1:8848/book/list            | get    |
| query         | http://127.0.0.1:8848/book/delete/{id}   | get    |
| add or update | http://127.0.0.1:8848/bookupdate         | post   |
| delete        | http://127.0.0.1:8848/bookquery/{keyword} | get    |


## deploy to cloud

1. upload the target jar package , Dockerfile & docker-compose.yml

2. run docker build command

``
sudo docker buildx build -t local/hsbc-book .
``
3. run docker deploy command

``
docker compose up -d
``

4. check the step 3 of the local run instruction by using the cloud server ip:8.138.21.244