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
5. Webhook: 