pipeline {

    agent {label 'docker-slave'}

    stages {

        stage ("Build") {
            steps {
                sh "mvn --version"
                sh "mvn help:effective-pom"
            }
        }

    }

}