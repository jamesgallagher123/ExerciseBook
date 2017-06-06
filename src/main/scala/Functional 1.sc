var stringArray: Array[String] = java.util.TimeZone.getAvailableIDs

for (i <- 0 to stringArray.length - 1) {
    println(stringArray(i))
}