# -------- Stage 1 : Build the application --------
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build the WAR file
RUN mvn clean package -DskipTests


# -------- Stage 2 : Runtime --------
FROM tomcat:9.0-jdk17-temurin

# Remove default apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR from builder stage
COPY --from=builder /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh","run"]
