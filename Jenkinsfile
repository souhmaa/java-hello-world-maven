pipeline {

    agent {label 'docker-slave'}

    stages {

        stage ("Build") {
            steps {
                sh "mvn deploy"
            }
        }

        stage ("Sonar analysis") {
            steps {
                withSonarQubeEnv('sonar') {
                    sh "mvn sonar:sonar"
                }
            }
        }

    }

}