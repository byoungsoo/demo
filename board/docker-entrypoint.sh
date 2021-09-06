JAVA_OPTS="${JAVA_OPTS} -Xms1024m -Xmx1024m"
JAVA_OPTS="${JAVA_OPTS} -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=256m"
JAVA_OPTS="${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom"
JAVA_OPTS="${JAVA_OPTS} -Dspring.profiles.active=dev"

exec java ${JAVA_OPTS} -jar /sorc001/<APP_NAME>.jar