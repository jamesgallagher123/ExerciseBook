def sumOfIntegers (int1: Int, int2: Int, isTrue: Boolean): Int = {
    if (isTrue) {
        int1 + int2
    } else {
        int1 * int2
    }
}

sumOfIntegers(2, 5, true)
sumOfIntegers(2, 5, false)