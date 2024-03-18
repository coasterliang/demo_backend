# instructions
## local run
1. checkout code
2. open in IntelliJ, running maven command

``
mvn clean & install
``

3. check the api result using browser or postman

| feature       | url   | method |
|---------------|-------|--------|
| list          | /list | get    |
| query         | /delete/{id}     | get    |
| add or update |  update     | post   |
| delete        |   query/{keyword}    | get    |


## deploy to cloud

1. upload the target jar package & Dockerfile 

2. run docker build command

``
sudo docker build -t local/hsbc-book .
``
3. run docker deploy command

``
sudo docker run -p 8848:8848 -t local/hsbc-book
``

4. check the step 3 of the local run instruction