pipeline {
       agent any
       
       tools {
           maven 'Maven 3.8.4'
           jdk 'JDK 11'
       }
       
       stages {
           stage('Checkout') {
               steps {
                    git branch: 'main', url: 'https://github.com/axnuzzz/Scientific_Calculator.git'
               }
           }
           
           stage('Build') {
               steps {
                   sh 'mvn clean package'
               }
           }
           
           stage('Test') {
               steps {
                   sh 'mvn test'
               }
           }
           
           stage('Docker Build') {
               steps {
                    sh 'sudo docker build -t scientific-calculator .'
               }
           }
           
           stage('Docker Push') {
               steps {
                   withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'axnuzz', passwordVariable: 'Anuj4anee')]) {
                       sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
                       sh 'docker push your-dockerhub-username/scientific-calculator:latest'
                   }
               }
           }
       }
   }