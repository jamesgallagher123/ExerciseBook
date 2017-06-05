def printSquare (stringInput: String, intInput: Int): Unit = {
    for (a <- 1 to intInput) {
        for (b <- 1 to intInput) {
            print(stringInput)
        }
        print("\n")
    }
}

printSquare("H", 4)