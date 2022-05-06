pipeline
{
    agent any

    environment
    {
        DOCKER_CREDENTIALS = credentials('docker_gamerbackend_token')
    }
        stages
        {
            stage('Git Pull')
            {
                steps
                {
                    // Get code from a GitHub repository
                    // Make sure to add your own git url and credentialsId
    				git url: 'https://github.com/kranky23/GamerBackend.git', branch: 'master',
                     credentialsId: 'jenkins_demo'
                }
            }
            stage('Maven Build')
            {
                steps
                {
                    // Maven build, 'sh' specifies it is a shell command
                    bat 'mvn clean install'
                }
            }

            stage ('Build Docker image')
            {
                steps
                {
                    bat 'docker build -t kranky23/gamerbackend:latest .'

                    echo 'Docker image built '
                }
            }

            stage ('Docker login and Push image to docker hub')
            {
                steps
                {
//                     withCredentials([usernamePassword(credentialsId: 'docker_gamerbackend_token', variable: 'DOCKER_CREDENTIALS ')])
//                     {
                        //sh 'docker login -u kranky23 -p $(dockerpwd)'

//                         bat 'echo DOCKER_CREDENTIALS | docker login --username kranky23 --password-stdin'
                        bat 'docker login --username kranky23 --password %DOCKER_LOGIN%'
//                         bat 'type C:/Users/Kaushik/Desktop/gamerDocker/my_password.txt | docker login --username kranky23 --password-stdin'
                        bat 'docker push kranky23/gamerbackend'
//                     }
                }
            }

            stage('Ansible deploy and Pull Image from docker hub ')
            {
                steps
                {
                    //Ansible Deploy to remote server (managed host)
                    ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'docker-compose.yml'
                    echo 'Docker compose running successfully'
                }
            }

        }
}
