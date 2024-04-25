pipeline {
   environment {
        registryCredential = 'dockerhub_id'
        registry = "venkataravisridhardevarakonda/swe645hw3"
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
                  def customImage = docker.build("venkataravisridhardevarakonda/swe645hw3:${env.TIMESTAMP}")
               }
            }
         }
      }

      stage('Push Image to Dockerhub') {
         steps {
            script{
               docker.withRegistry('',registryCredential){
                  sh "docker push venkataravisridhardevarakonda/swe645hw3:${env.TIMESTAMP}"
               }
            }
         }
      }
      
      stage('Deploying to Rancher on a single node, which is configured to have three replicas deployed.') {
         steps {
            script{
               withKubeConfig([credentialsId: 'kubeconfig_credentials', serverUrl: 'https://ec2-52-6-143-211.compute-1.amazonaws.com/k8s/clusters/c-m-hwdrvxbs']) {
                   sh "kubectl set image deployment/spring container-0=venkataravisridhardevarakonda/swe645hw3:${env.TIMESTAMP} -n default"
               }
            }
         }
      }

   }
}