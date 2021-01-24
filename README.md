# microservicesamples
microservice samples

#AuthSecurity <br/>
Install Git for installing openssl in windows machine <br/>
Go to Git CMD and Go to C:\Program Files\Git\usr\bin i.e your Git installationation directory <br/>
Then follow step 1 & 2 to generate pprivate key and public key <br/>

1. generate private key <br/>
openssl genrsa -out jwt.pem 2048 <br/>
openssl rsa -in jwt.pem <br/>
2. generate public key <br/>
openssl rsa -in jwt.pem -pubout <br/>

Copy private key and public key and replace the same in application.properties file <br/>

3. generate authorization token <br/>
 a) Open postman and set POST method and URL http://localhost:9080/oauth/token <br/>
 b) Click on Authorization tab and Choose Type "Basic Auth", enter "Username" and "Password" based on your clientid and clientSecret in application.properties <br/>
 c) Click on Headers tab and set Content-Type = application/x-www-form-urlencoded <br/>
 d) Click on Body tab and set grant_type=password, username=***, password=*** based on your entries in your USERS table <br/>
 e) hit the SEND button and copy the access_token <br/>

4. set GET method , click on Headers tab and set Authorization = Bearer access_token, URL http://localhost:9080/products <br/>
