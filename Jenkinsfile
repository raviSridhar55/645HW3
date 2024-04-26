pipeline {
    agent any

    environment {
        registryCredential = 'dockerhub_id'
        registry = "venkataravisridhardevarakonda/spring-survey"
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
    }

    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Install') {
            steps {
                sh 'mvn install'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        def customImage = docker.build("venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP}")
                    }
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        sh "docker push venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP}"
                    }
                }
            }
        }

        stage('Update Kubernetes Deployment') {
            steps {
                script {
                    withKubeConfig([credentialsId: 'kubeconfig_credentials', serverUrl: 'https://ec2-3-227-26-92.compute-1.amazonaws.com/k8s/clusters/c-m-qxtljqz9']) {
                        sh "kubectl set image deployment/springsurvey container-0=venkataravisridhardevarakonda/spring-survey:${env.TIMESTAMP} -n default"
                    }
                }
            }
        }
    }
}
