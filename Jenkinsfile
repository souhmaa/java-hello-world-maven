pipeline {

    agent {label 'docker-slave'}

    tools {
        maven "maven-3.6.0"
        jdk "jdk-8"
    }

    stages {

        stage ("Build") {
            steps {
                sh "mvn package"
            }
        }

    }

}