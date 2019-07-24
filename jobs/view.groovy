listView('Desarrollo') {
    description('Pipelines que estan en desarrollo')
    jobs {
        regex(/.*Desarrollo.*/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}  
