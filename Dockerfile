FROM openjdk:21-slim

EXPOSE 8080

WORKDIR /app


COPY ./pom.xml /app
COPY ./.mvn /app/.mvn
COPY ./mvnw /app/

#descarga las dependencias
RUN ./mvnw dependency:go-offline

#copiar el resto de los archivo
COPY ./src /app/src
#construir proyecto en el contenedor
RUN ./mvnw clean install -DskipTests

#levantar la aplicacion cuando el contenedor inicie
ENTRYPOINT [ "java", "-jar", "/app/target/MyHotel-0.0.1-SNAPSHOT.jar" ]



