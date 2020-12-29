pipeline {
    agent any

    stages {
        stage('Git Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/sushant-pandey/comp-calc.git'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'jenkinsdeployer', path: '', url: 'http://localhost:9000/')], contextPath: 'comp-calc', war: '**/*.war'
            }
        }
        stage('run-parallel-branches') {
            steps {
                parallel(
                    a: {
                        echo "This is branch a"
                    },
                    b: {
                        echo "This is branch b"
                    }
                )
            }
}
    }
}