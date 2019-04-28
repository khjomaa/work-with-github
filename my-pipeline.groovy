pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                git "https://github.com/khjomaa/work-with-github.git"
            }
        }
        stage("run something") {
            steps {
                echo "Hello World!"
            }
        }
    }
}