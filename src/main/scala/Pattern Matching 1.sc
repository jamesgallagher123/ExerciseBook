def sumOfIntegers (int1: Int, int2: Int, isTrue: Boolean): Int = isTrue match {
    case true => int1 + int2
    case false => int1 * int2
}

sumOfIntegers(2, 5, true)
sumOfIntegers(2, 5, false)



def returnNonZero (int1: Int, int2: Int): Int = {
    if (int1 == 0 && int2 == 0) {
        0
    } else if (int1 == 0 && int2 != 0) {
        int2
    } else {
        int1
    }
}

returnNonZero(0, 1)
returnNonZero(2, 0)
returnNonZero(0, 0)