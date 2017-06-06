def blackack (int1: Int, int2: Int): Int =  {
    if (int1 > 21 && int2 > 21) {
        0
    } else if (int1 > int2) {
        int1
    } else {
        int2
    }
}

blackack(18,21)
blackack(20,18)
blackack(22,22)