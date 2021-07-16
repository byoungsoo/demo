FROM tomcat/8.5-jdk8-openjdk

ENV JAVA_OPTS="${JAVA_OPTS} -Xms1024m -Xmx1024m"
ENV JAVA_OPTS="${JAVA_OPTS} -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=256m"
ENV JAVA_OPTS="${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom"
ENV JAVA_OPTS="${JAVA_OPTS} -Dspring.profiles.active=dev"

# Source Copy
RUN mkdir -p /sorc001/<APP_NAME>
COPY /target/<APP_NAME>-0.0.1.war /sorc001/<APP_NAME>.war
RUN  unzip /sorc001/<APP_NAME>.war -d /sorc001/<APP_NAME> && rm -rf /sorc001/<APP_NAME>.war

# Tomcat File Copy
COPY cicd/tomcat/server.xml /usr/local/tomcat/conf/server.xml

# Port Expose
EXPOSE 8080