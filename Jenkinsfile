pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean compile'
            }
        }

        stage('Approval') {
            options {
                timeout(time: 2, unit: 'MINUTES')
            }
            steps {
                input message: 'Deploy to Production?', ok: 'Yes, Deploy'
            }
        }


        stage('Parallel stages') {
            parallel {
                stage('Test') {
                    steps {
                        sh './mvnw test'
                    }
                }

                stage('Package') {
                    steps {
                        sh './mvnw package'
                    }
                }
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
