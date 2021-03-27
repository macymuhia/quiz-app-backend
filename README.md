# Quiz App Backend

### Assumptions
- Java installed (Java 11)
- Mysql installed 
- Intellij (or preferred editor)

### Project setup

#### Database

`CREATE DATABASE quiz_app;`

- in application-dev.yml, replace the username and password with your database user and password.

#### running

`./gradlew bootRun` (Can use intellij's run button)

### API's

#### Signup API
`curl --request POST \
   --url http://localhost:8050/api/v1/quizapp/api/auth/signup \
   --header 'Content-Type: application/json' \
   --data '{
 	"username": "mercy.njer",
 	"email": "mercy.njeri@gmail.com",
 	"role": "admin",
 	"password": "admin123"
 }'`
 
 #### Signin API
 `curl --request POST \
    --url http://localhost:8050/api/v1/quizapp/api/auth/signin \
    --header 'Content-Type: application/json' \
    --data '{
  	"username": "mercy.njeri",
  	"password": "admin123"
  }'`