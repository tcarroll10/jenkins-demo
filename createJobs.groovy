
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tcarroll10/jenkins.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}