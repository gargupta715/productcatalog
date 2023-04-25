FROM openjdk:8
EXPOSE 8080
VOLUME /tmp
# ARG JAR_FILE
COPY build/libs/*.jar productcatalog.jar
ENTRYPOINT ["java","-jar","/productcatalog.jar"]