var primes: Array[Int]  =  Array(2)
val max: Int = 3000000
var isPrime: Boolean = true

for (x <- 3 to max by 2) {
    isPrime = true
    for (index <- 0 to primes.length - 1) {
        if (x % primes(index) == 0) {
            isPrime = false
        }
    }
    if (isPrime) {
        primes :+ x
    }
}

println(primes.length)


















var testArray: Array[Int] = Array(0, 1, 2)

testArray :+ 3

for (index <- 0 to testArray.length) {
    println(index)
}