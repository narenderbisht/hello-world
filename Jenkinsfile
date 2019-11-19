pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
		
		stage('docker-image-creation') { 
		 steps{
			script {
				docker.build hello-world-jenkins + ":$BUILD_NUMBER"
			}
        }
    }
}