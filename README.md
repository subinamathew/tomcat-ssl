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

Once the set option is used we get the error

````md
Bad Request
This combination of host and port requires TLS.
````

This url can however be accesed on local desktop or by forwarding the ssh port

ssh -L 8443:loclahost:8443 <ssh URL + UserId + Password>

The URL with userid and password can be got https://gitpod.io/workspaces in the *connect via SSH* option