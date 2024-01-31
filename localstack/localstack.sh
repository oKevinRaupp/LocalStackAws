@echo off

aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/localstackAWS_localstack/helloWorld" --value "Hello World Parameter Store" --type String

echo ### Criando Segredos no AWS Secret Manager do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/localstackAWS_localstack --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/localstackAWS --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application_localstack --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"

echo ### Criando Bucket no S3 do LocalStack...
aws --endpoint http://localhost:4566 --profile localstack s3 mb s3://s3-helloworld