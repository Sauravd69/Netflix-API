# Netflix-API

### WAR
1. This branch is a POC to create war file & deploy to tomcat manually
2. POC to deploy war file to tomcat through Jenkins free style
3. POC to create jenkins file under the project & deploy to tomcat through Jenkins pipeline (script from SCM)
4. POC to deploy war file to tomcat through Jenkins pipeline
5. Refer pipeline-script-from-scm.png and pipeline called netflix-pipeline-poc, netflix-freestyle-poc

### DEV
1. This branch is a POC to create jar file & deploy to EC2

### Note
1. Extends SpringBootServletInitializer and override configure method to deploy war in tomcat
2. To deploy war file through jenkins, install Deploy to Container plugin from Manage Plugin option
3. There is no use and need of server.servlet.context-path in property file
4. For setting up profile:
   https://riptutorial.com/spring-boot/example/31100/set-the-right-spring-profile-by-building-the-application-automatically--maven-
5. Webhook didn't work because it's not possible to trigger jenkins jobs from GitHub webhook locally.
   No need to install any plugin. Refer trigger-pipeline-on-each-commit-poc
6. To integrate Tomcat credential with Jenkins, use credential of manager-script roles from tomcat-users.xml
7. For integrating SonarQube with Jenkins follow below except generating token
   https://www.youtube.com/watch?v=wn9wWYAShag&t=542s
8. Refer below for Unit testing https://stackabuse.com/guide-to-unit-testing-spring-boot-rest-apis/

### Tomcat
1. To start server double-click on Windows batch file bin\startup
2. To start server double-click on Windows batch file bin\shutdown
3. To change port conf\server.xml & update connector port

### Jenkins
1. Run java -jar jenkins.war in command. By default for Jenkins port will be 8080

### SonarQube
1. To start server double-click on Windows batch file bin\windows-x86-64\StartSonar
2. By default for SonarQube port will be 9000