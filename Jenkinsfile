pipeline
{
    agent any
    environment
    {
       DATABASE_URL = "jdbc:mysql://localhost:3306/gamerDB"
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
                    sh 'mvn clean install'
                }
            }

            stage ('Build Docker image')
            {
                steps
                {
                    sh 'docker build -t kranky23/gamerbackend:latest .'

                    echo 'Docker image built '
                }
            }

            stage ('Docker login and Push image to docker hub')
            {
                steps
                {
//

                        sh 'cat ~/my_password.txt | docker login --username kranky23 --password-stdin'
                        sh 'docker push kranky23/gamerbackend'
//
                }
            }

            stage('Ansible deploy and Pull Image from docker hub ')
            {
                steps
                {
                    //Ansible Deploy to remote server (managed host)
                    ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml'
                    echo 'Docker compose running successfully'
                }
            }

        }
}
