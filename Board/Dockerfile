FROM openjdk:11.0.12-jdk-slim

ENV AWS_XRAY_CONTEXT_MISSING LOG_ERROR

# Source Copy
RUN mkdir -p /sorc001/<APP_NAME>
RUN pwd
COPY target/<APP_NAME>-0.0.1.jar /sorc001/<APP_NAME>.jar

# Port Expose
ENTRYPOINT ["./docker-entrypoint.sh"]