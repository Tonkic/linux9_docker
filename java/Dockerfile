FROM tomcat:latest
COPY ./java/mysql-connector-java-8.0.33.jar /usr/local/tomcat/lib/mysql-connector-java-8.0.33.jar
COPY ./java/tomcat_war.war /usr/local/tomcat/webapps/ROOT.war
# 将Tomcat的默认HTTP端口暴露出来
EXPOSE 8080
# 启动Tomcat服务器
CMD ["catalina.sh", "run"]