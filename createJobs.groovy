pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/KuroNguyen/themepark.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}