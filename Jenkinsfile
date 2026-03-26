pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/kishorekumars2025-AI/SmartCustomerOps.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Check Output') {
            steps {
                bat 'dir target'
            }
        }
    }
}
