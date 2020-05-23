# ****************************************************************
# Commands to build and run ( Execute it in the shell )
# ****************************************************************
#   clear && JAVA_HOME=$(dirname $( readlink -f $(which java) )) &&
#   JAVA_HOME=$(realpath "$JAVA_HOME"/../) &&
#   export JAVA_HOME &&
#   mvn clean &&
#   ./mvnw install &&
#   docker build -t refund . &&
#   docker run -p 8882:8882 refund
#*****************************************************************

# In this case we are using .jar insted of .war

FROM openjdk:12-alpine
COPY target/Refund-1.0.0-SNAPSHOT-fat.jar /refund.jar
CMD ["java", "-jar", "/refund.jar"]
ENTRYPOINT [ "sh", "-c", "java -jar refund.jar" ]
