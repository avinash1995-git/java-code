pipeline {

    agent any

    stages {

        stage ('Buld') {
            steps {
            echo 'build'
        }
    }

    stage ('Deploy') {
            steps {
            echo 'Deploy'
        }
    }

    stage ('Test') {
            steps {
            echo 'Test'
        }
    }
    }
}
   

    