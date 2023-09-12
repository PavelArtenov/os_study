// Based on:
// https://raw.githubusercontent.com/redhat-cop/container-pipelines/master/basic-spring-boot/Jenkinsfile

library identifier: "pipeline-library@v1.5",
retriever: modernSCM(
  [
    $class: "GitSCMSource",
    remote: "https://github.com/redhat-cop/pipeline-library.git"
  ]
)

// The name you want to give your Spring Boot application
// Each resource related to your app will be given this name
appName = "app"

pipeline {
	agent none
  stages {
  	stage('Maven Install') {
    	agent any
      steps {
      	bat './gradlew clean build'
      }
    }
    stage('Docker Build') {
    	agent any
      steps {
      	bat 'docker build .'
      }
    }
  }
}
