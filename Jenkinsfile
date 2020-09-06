pipeline {

    // agent {label 'docker-slave'}
    agent any

    stages {

        stage ("Build") {
            steps {
                sh "mvn --version"
                sh "mvn help:effective-pom"
            }
        }

    }

}