if [ "$DISCOVERY_ENV" = "production" ]
then
exec java -Xmx4g -Xms2g  -jar target/demo-0.0.1-SNAPSHOT.jar  --spring.profiles.active=production
elif [ "$DISCOVERY_ENV" = "staging" ]
then
exec java -Xmx4g -Xms2g -jar target/demo-0.0.1-SNAPSHOT.jar  --spring.profiles.active=staging
else
exec java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=default
fi
