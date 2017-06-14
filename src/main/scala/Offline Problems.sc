def task1(inputString: String): String = {
    var resultString: String = ""
    for (x <- 0 to inputString .length - 1) {
        resultString += (inputString.charAt(x))
        resultString += (inputString.charAt(x))
    }
    return resultString
}
task1("The")
task1("AAbb")
task1("Hi-There")

def task2(inputString: String): Unit = {
    var splitStringArray: Array[String] = inputString.split("bread")
    splitStringArray.foreach(x => println(x))
    //print(splitStringArray.length.toString)
    //remove empty elements
    //if there's 1 string in array print it
    // if only 2 arrays then there was only one bread
    //get middle array and print
}

task2("breadjambread")
//task2("xxbreadjambreadyy")
//task2("xxbreadyy")

def task3(a: Int, b: Int, c: Int): Boolean = {
    var intArray: Array[Int] = Array(a, b, c).sorted
    var diff1: Int = intArray(1) - intArray(0)
    var diff2: Int = intArray(2) - intArray(1)
    if (diff1 == diff2) {
        return true
    } else {
        return false
    }
}
task3(2, 4, 6)
task3(4, 6, 2)
task3(4, 6, 3)

def task6(inputString: String, n: Int): String = {
    var substring1: String = inputString.substring(0, n)
    var substring2: String = inputString.substring(inputString.length - n, inputString.length)

    return substring1.concat(substring2)
}
task6("Hello", 2)
task6("Chocolate", 3)
task6("Chocolate", 1)

def task7(inputString: String) : Boolean = {
    if (inputString.length < 2) {
       return false
    }
    if (inputString.substring(inputString.length - 2, inputString.length) == "ly") {
        return true
    } else {
        return false
    }
}
task7("oddly")
task7("y")
task7("oddy")

def task9(): Unit = {
    println("   *   ")
    println("  ***  ")
    println(" ***** ")
    println("*******")
    println(" ***** ")
    println("  ***  ")
    println("   *   ")
}
task9()

def task10(): Unit = {
    println("   *   ")
    println("  * *  ")
    println(" *   * ")
    println("*     *")
    println(" *   * ")
    println("  * *  ")
    println("   *   ")
}
task10()