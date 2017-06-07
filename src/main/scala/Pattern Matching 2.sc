def swapOrder(container: Any): Unit = {
    container match {
        case intArray: Array[Int] => println(intArray(1), intArray(0))
        case intList: List[Int]  => println(intList(1), intList(0))
        //case (x, y) => println(intTuple.swap)
    }
}

var intArray: Array[Int] = Array(1, 2)
var intList: List[Int] = List(1, 2)
//var intTuple = (1, 2)

swapOrder(intArray)
swapOrder(intList)
//swapOrder(intTuple)