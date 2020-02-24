
pipeline{
  agent { label 'maven' }
  stages{
    stage ('checkout'){
      steps{
        checkout scm
      }
    }

    stage ('build') {
      steps{
      sh "mvn clean package -DskipTests"       
      }
    }
    stage ('build image') {
      steps{
      sh '''
          oc start-build customer-build --from-dir=. --follow
        '''
      }
    }

    
    
  }
}
