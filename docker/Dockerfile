FROM payara/micro:5.181
LABEL maintainer="kazusato"
COPY build/libs/k8sworkapp.war /opt/payara/deployments
USER root
RUN mkdir /var/log/payara && \
  chown payara:payara /var/log/payara
USER payara
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "/opt/payara/payara-micro.jar", \
 "--deploymentDir", "/opt/payara/deployments"]

