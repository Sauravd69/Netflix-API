node{

   def tomcatWeb = 'C:\\My App\\apache-tomcat-9.0.63\\webapps'

   stage('Git Checkout'){
     git 'https://github.com/Sauravd69/Netflix-API'
   }

   stage('MVN Package'){
      // Get maven home path
      def mvnHome =  tool name: 'maven-3', type: 'maven'
      bat "${mvnHome}/bin/mvn package"
   }

   stage('Deploy to Tomcat'){
     bat "copy target\\netflix.war \"${tomcatWeb}\\netflix.war\""
   }

}