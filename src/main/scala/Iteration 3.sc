def fizzBuzz (string1: String, string2: String, inputInt: Int): Unit = {
    for (n <- 1 to inputInt) {
        if (n % 3 == 0 && n % 5 == 0) {
            print(string1.concat(string2))
        } else if (n % 3 == 0) {
            print(string1 + ",")
        } else if (n % 5 == 0) {
            print(string2 + ",")
        } else {
            print(n + ",")
        }
    }
}

fizzBuzz("Fizz", "Buzz", 15)