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