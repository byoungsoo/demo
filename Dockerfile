FROM tomcat/8.5-jdk8-openjdk

ENV JAVA_OPTS="${JAVA_OPTS} -Xms1024m -Xmx1024m"
ENV JAVA_OPTS="${JAVA_OPTS} -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=256m"
ENV JAVA_OPTS="${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom"


# Source Copy
RUN mkdir -p /sorc001/<APPLICATION_NAME>
COPY /build/libs/<APPLICATION_NAME>.war /sorc001/<APPLICATION_NAME>.war
RUN  unzip /sorc001/<APPLICATION_NAME>.war -d /sorc001/<APPLICATION_NAME> && rm -rf /sorc001/<APPLICATION_NAME>.war

# Tomcat File Copy
COPY env/<ENVIRONMENT>/server.xml /usr/local/tomcat/conf/server.xml
COPY env/<ENVIRONMENT>/context.xml /usr/local/tomcat/conf/context.xml

# Jennifer
RUN sed -i "s/<MANAGER_IP>/<JENNIFER_MANAGER_IP>/g" /jennifer/agent.java/conf/tomcat01.conf
RUN sed -i "s/<MANAGER_PORT>/<JENNIFER_MANAGER_PORT>/g" /jennifer/agent.java/conf/tomcat01.conf
RUN sed -i "s/<DOMAIN_ID>/<JENNIFER_DOMAIN_ID>/g" /jennifer/agent.java/conf/tomcat01.conf

# Port Expose
EXPOSE <APPLICATION_PORT>