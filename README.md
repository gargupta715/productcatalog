# Extension Pack for Java
# Spring Boot Extension Pack
# ctrl+ shift+ X install vscode-spring-initializr
# Auto Import



https://code.visualstudio.com/docs/java/java-spring-boot#:~:text=To%20install%2C%20launch%20VS%20Code,and%20then%20follow%20the%20wizard.

java -jar build/libs/productcatalog-0.0.1.jar

Docker command to create a image 
docker build --build-arg JAR_FILE=build/libs/*.jar -t myorg/productcatalog .
docker build -t productcatalog .
docker run -p 8080:8080 myorg/myapp
docker run -ti --entrypoint /bin/sh myorg/myapp


ENTRYPOINT exec java -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$JVM_HEAP_DUMP_PATH -Dspring.profiles.active=$SPRING_PROFILE -Dspring.application.name="productcatalog" -jar productcatalog.jar
