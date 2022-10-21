# Simple Java App

This is a simple Java application with tomcat

See the app on http://localhost:8443 or https://localhost:8443

Use the command

````bash

bash activate-cert.sh <set/reset> 

````
set: uses the selfsigned certificate by setting *SSLEnabled="true"*
reset: removes the SSLEnabled="true" and sets *SSLEnabled="false"* in tomcat server.xml

These files can be found in the settings folder.

