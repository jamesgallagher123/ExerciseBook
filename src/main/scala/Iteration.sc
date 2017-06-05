def printNTimes (stringInput: String, intInput: Int): Unit = {
    for (n <- 1 to intInput) {
        println(stringInput)
    }
}

printNTimes("Hi", 3)