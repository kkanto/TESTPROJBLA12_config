 
listView('TESTPROJBLA12 Jobs') {
    description('TESTPROJBLA12 Jobs')
    jobs {
        regex('TESTPROJBLA12_.+')
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
