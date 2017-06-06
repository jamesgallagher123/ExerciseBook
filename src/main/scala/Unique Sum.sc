def uniqueSum(int1: Int, int2: Int, int3: Int): Int = {
    var list: List[Int] = List(int1, int2, int3)
    var sum: Int = 0
    var noDuplicates: List[Int] = list.distinct

    for (i => 0 to noDuplicates.length - 1) {
        sum += noDuplicates(i)
    }

}

uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)