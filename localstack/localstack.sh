@echo off
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/localstackAWS_localstack/helloWorld" --value "Hello World Parameter Store" --type String