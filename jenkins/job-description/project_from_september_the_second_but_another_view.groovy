 
listView('project_from_september_the_second_but_another Jobs') {
    description('project_from_september_the_second_but_another Jobs')
    jobs {
        regex('project_from_september_the_second_but_another_.+')
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
