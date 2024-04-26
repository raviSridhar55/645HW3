pipeline {
   environment {
        registryCredential = 'dockerhub_id'
        registry = "venkataravisridhardevarakonda/spring-survey"
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
    }
   agent any
   tools {
    maven 'Maven 3.6.3'
}

   stages {
    stage('Maven Clean') {
            steps {
               script{
                sh 'mvn clean'
               }
            }
        }
        stage('Maven Install') {
            steps {
               script{
                sh 'mvn install'
            }
            }
        }
      stage('Build Docker Image') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  def customImage = docker.build("venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP}")
               }
            }
         }
      }

      stage('Push Image to Dockerhub') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  sh "docker push venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP}"
               }
            }
         }
      }
      
      // stage('Deploying to Rancher to single node(deployed in 3 replicas)') {
      //    steps {
      //       script{
      //          sh "kubectl set image deployment/springsurvey container-0=venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP} -n default"
      //       }
      //    }
      // }

      stage('Deploying to Rancher utilizing a Load Balancer as a service.') {
         steps {
            script{
               withKubeConfig([credentialsId: 'kubeconfig_credentials', serverUrl: 'https://ec2-3-227-26-92.compute-1.amazonaws.com/k8s/clusters/c-m-qxtljqz9']) {
                   sh "kubectl set image deployment/springsurvey container-0=venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP} -n default"
               }
            }
         }
      }

   }
}