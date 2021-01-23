FROM openjdk:11
EXPOSE 7071
ENV EUREKA_SERVER=service-discovery
VOLUME [ "/DockerWorkspace" ]
COPY wait-for-it.sh wait-for-it.sh
RUN chmod +x wait-for-it.sh
COPY wait-and-run.sh wait-and-run.sh
RUN chmod +x wait-and-run.sh
ENTRYPOINT ["java","-jar","./DockerWorkspace/limits-service/target/limits-service-0.0.1-SNAPSHOT.jar"]