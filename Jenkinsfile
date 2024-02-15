pipeline {
  agent any

  stages {
    stage('Checkout'){
      steps{
        git 'https://github.com/sbFranj/myStrangeCalculator.git'
      }
    }
    stage('Build'){
      steps{
        sh 'mkdir -p webapps/Calculadora'
        sh 'cp -r Jenkisfile build src webapps/Calculadora/'
      }
    }
    stage('Deploy'){
      steps{
        echo 'Despliegue exitoso'
      }
    }
  }
}
