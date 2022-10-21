
echo "bash activate-cert.sh set|reset (default)"

function set () {
    cp settings/server_https.xml apache-tomcat-9.0.68/conf/server.xml
}

function reset () {
    cp settings/server.xml apache-tomcat-9.0.68/conf/server.xml
}

sh apache-tomcat-9.0.68/bin/catalina.sh jpda stop
sleep 5

if [ $1 = "set" ]; then
    set
else
    reset
fi

sh apache-tomcat-9.0.68/bin/catalina.sh jpda start
