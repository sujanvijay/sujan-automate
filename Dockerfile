FROM tomcat:10-jdk17

COPY target/sujan-portfolio.war /usr/local/tomcat/webapps/

EXPOSE 8080
