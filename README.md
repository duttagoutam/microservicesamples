# microservicesamples
microservice samples

#AuthSecurity
Install Git for installing openssl in windows machine
Go to Git CMD and Go to C:\Program Files\Git\usr\bin i.e your Git installationation directory
Then follow step 1 & 2 to generate pprivate key and public key

1. generate private key
openssl genrsa -out jwt.pem 2048
openssl rsa -in jwt.pem 
2. generate public key
openssl rsa -in jwt.pem -pubout

Copy private key and public key and replace the same in application.properties file

3. generate authorization token
 a) Open postman and set POST method and URL http://localhost:9080/oauth/token
 b) Click on Authorization tab and Choose Type "Basic Auth", enter "Username" and "Password" based on your clientid and clientSecret in application.properties
 c) Click on Headers tab and set Content-Type = application/x-www-form-urlencoded
 d) Click on Body tab and set grant_type=password, username=***, password=*** based on your entries in your USERS table
 e) hit the SEND button and copy the access_token

4. set GET method , click on Headers tab and set Authorization = Bearer access_token, URL http://localhost:9080/products
