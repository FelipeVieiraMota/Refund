clear &&
JAVA_HOME=$(dirname $( readlink -f $(which java) )) &&
JAVA_HOME=$(realpath "$JAVA_HOME"/../) &&
export JAVA_HOME &&
mvn clean &&
chmod +x mvnw &&
./mvnw install &&
docker-compose build &&
docker-compose up
