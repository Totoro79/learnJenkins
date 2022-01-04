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
            echo "Get the driver path ${ChromeDriverPath}"
          }
        }

        stage('Test Log') {
          environment{
            LocalVariable = "Hello Local"
          }
          steps {
            writeFile(file: 'LogTestFile.txt', text: "This is an automation file log with ${ChromeDriverPath} and local variable ${LocalVariable}.")
          }
        }

      }
    }

    stage('Deploy') {
      parallel {
        when {
          branch 'master'
        }
        stage('Deploy') {
          steps {
            echo 'Deploy the application'
            input(message: 'Do you want to deploy?', id: 'OK')
          }
        }

        stage('Artifacts') {
          steps {
            archiveArtifacts 'LogTestFile.txt'
          }
        }

      }
    }

  }
  environment {
    ChromeDriverPath = 'C:\\local\\chrome.exe'
  }
}