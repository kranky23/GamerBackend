pipeline
{
    		agent any
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
                    withCredentials([string(credentialsId: '12', variable: 'dockerpwd')])
                    {
                        //sh 'docker login -u kranky23 -p $(dockerpwd)'

                        bat 'type ~/my_password.txt | docker login --username kranky23 --password-stdin'

                        bat 'docker push kranky23/gamerbackend'
                    }
                }
            }

        }
}
