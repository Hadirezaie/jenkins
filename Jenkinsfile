pipeline {
    agent any

    stages {
        stage('Checkout Info') {
            steps {
                echo 'Pipeline started from Jenkinsfile'
            }
        }

        stage('Show Files') {
            steps {
                sh 'ls -la'
            }
        }

        stage('Read File') {
            steps {
                sh 'cat README.md'
            }
        }
    }
}