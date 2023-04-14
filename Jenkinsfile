pipeline {
    agent any
    //triggers {cron {"* * * * * "}}

    stages {
        stage('Init') {
            steps {
                echo "Testing..."
            }
        }
        stage('Run') {
            steps {
                 bat "mvngit  test"
            }
        }
    }

      post {
        always {
          step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
        }
      }
}