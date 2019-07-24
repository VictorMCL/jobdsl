multibranchPipelineJob('Desarrollo_flask_docker') {
    branchSources {
        git {
            remote("git@github.com:VictorMCL/test-jenkins.git")
        }
    }
    triggers {
        periodic(1)
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}

