pipeline {
    agent any

    tools {
        maven 'maven3'
    }

    stages {

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

        stage('SonarQube') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t sujan-portfolio .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'kubectl apply -f k8s/'
            }
        }
    }
}
