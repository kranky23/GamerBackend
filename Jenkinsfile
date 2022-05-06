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
                    sh 'mvn clean install'
                }
            }
        }
}
