# Étape 1 : Utilise l'image officielle avec Java 21
FROM openjdk:21-jdk-slim

# Étape 2 : Copie le fichier JAR généré par ton projet Maven dans le conteneur, en le renommant app.jar
COPY target/ProjetAnglais2-0.0.1-SNAPSHOT.jar app.jar

# Étape 3 : Expose le port 8080 (Spring Boot écoute par défaut sur ce port)
EXPOSE 8080

# Étape 4 : Lance l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]
