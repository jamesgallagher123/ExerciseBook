def uniqueSum(int1: Int, int2: Int, int3: Int): Int = {
    var array: Array[Int] = Array(int1, int2, int3)
    var sum: Int = 0

    if (array(0) == array(1) && array(0) == array(2)) {
        array(0) = 0
        array(1) = 0
        array(2) = 0
    }
    if (array(0) == array(1)) {
        array(0) = 0
        array(1) = 0
    }
    if (array(0) == array(2)) {
        array(0) = 0
        array(2) = 0
    }
    if (array(1) == array(2)) {
        array(1) = 0
        array(2) = 0
    }

    for (i <- 0 to 2) {
        sum += array(i)
    }

    return sum
}

uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)