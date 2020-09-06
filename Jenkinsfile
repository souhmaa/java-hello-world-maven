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
                configFileProvider([configFile(fileId: 'mvn-settings', variable: 'MAVEN_SETTINGS_XML')]) {
                    sh "mvn --version"
                    sh "mvn -s $MAVEN_SETTINGS_XML help:effective-pom"
                }
            }
        }

    }

}