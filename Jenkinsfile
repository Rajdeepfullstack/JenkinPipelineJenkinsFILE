pipeline{
    
 agent any

    tools{
        maven 'MAVEN_HOME'
    }
    
    
    stages{
        
        stage("Tools initialization"){
            
            steps{
                bat "mvn --version"
                bat "java --version"
            }
        }
        
        stage('Pull project from GIT'){
            
            steps{
                git 'https://github.com/Rajdeepfullstack/JenkinPipelineJenkinsFILE.git'
            }
        }
        
        stage("Building the Project"){
            
            steps {
                pwd()
                dir('jenkinsPipelineJenkinsFILE') {
                pwd()
                bat "mvn clean"
                }
                
            } 
        }
        
        stage("Running Test cases"){
            
            steps{
                
                dir('jenkinsPipelineJenkinsFILE'){
                    bat 'mvn test'
                }
            }
        }
        
    }
    
    post{
        always{
            emailext body: 'Mail for successful Build ', subject: 'Pipeline Using Jenkins file', to: 'fullstackautomationlearning@gmail.com'
        }
    }
    
}
