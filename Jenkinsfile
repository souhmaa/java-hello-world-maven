pipeline {

    // agent {label 'docker-slave'}
    agent any

    tools {
        jdk "jdk-8"
        maven "maven-3.6.0"
    }

    stages {

        stage ("Build") {
            steps {
                sh "mvn --version"
                sh "mvn help:effective-pom"
            }
        }

    }

}