pipeline {

    agent {label 'docker-slave'}

    tools {
        maven "maven-3.6.0"
        jdk "jdk-8"
    }

    stages {

        stage ("Display") {
            steps {
                sh "echo HELLO WORLD"
                sh "mvn --version"
                sh "java --version"
            }
        }

    }

}