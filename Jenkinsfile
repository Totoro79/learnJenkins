pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Build a java application'
          }
        }

        stage('Test') {
          steps {
            echo 'Test application'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploy the application'
        input(message: 'Do you want to deploy?', id: 'OK')
      }
    }

  }
}