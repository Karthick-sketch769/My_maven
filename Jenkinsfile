pipeline 
{
    agent any

    stages 
    {
        stage('get the source code') 
        {
            steps 
            {
                echo 'Build App'
            }
        }

        stage('Test the scheduled build') 
        {
            steps 
            {
                echo 'Test App'
            }
        }

        stage('jenkins task') 
        {
            steps 
            {
                echo 'Deploy App'
            }
        }
    }

    post
    {

    	always
    	{
    		emailext body: 'Summary', subject: 'Pipeline Status', to: 'karthicksethu189@gmail.com'
    	}

    }
}
