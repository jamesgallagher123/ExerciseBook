def sumOfIntegers (int1: Int, int2: Int, isTrue: Boolean): Int = {
    isTrue match {
        case true => int1 + int2
        case false => int1 * int2
    }
}

sumOfIntegers(2, 5, true)
sumOfIntegers(2, 5, false)



def returnNonZero (int1: Int, int2: Int): Unit = {
    (int1, int2) match {
        case (0, 0) => print("0")
        case (_ , 0) => print(int1)
        case (0, _) => print(int2)
    }
}

returnNonZero(0, 1)
returnNonZero(2, 0)
returnNonZero(0, 0)