pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "mvn compile"
                bat "mvn clean package"
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
