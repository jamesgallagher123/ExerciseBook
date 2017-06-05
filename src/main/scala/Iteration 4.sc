def printNTimes (stringInput: String, intInput: Int): Unit = {
    if(intInput > 0) {
        println(stringInput)
        printNTimes(stringInput, intInput - 1)
    }
}

printNTimes("Hi", 3)



def printSquare (stringInput: String, intInput: Int, index: Int): Unit = {
    if (intInput > 0) {
        println(stringInput*index)
        printSquare(stringInput, intInput - 1, index)
    }
}

printSquare("H", 4, 4)



def fizzBuzz (string1: String, string2: String, inputInt: Int, counter: Int): Unit = {
    if (counter <= inputInt) {
        if (counter % 3 == 0 && counter % 5 == 0) {
            print(string1.concat(string2))
        } else if (counter % 3 == 0) {
            print(string1 + ",")
        } else if (counter % 5 == 0) {
            print(string2 + ",")
        } else {
            print(counter + ",")
        }
        fizzBuzz(string1, string2, inputInt, counter + 1)
    }
}

fizzBuzz("Fizz", "Buzz", 15, 0)