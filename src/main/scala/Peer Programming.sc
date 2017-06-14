val myNumber: Int = 27
var min: Int = 0
var max: Int = 100

def guessNumber(guess: Int): Int = {
    if (guess == myNumber) {
        guess
    } else if (guess > myNumber) {
        max = guess
        println(guess+ " Lower")
        guessNumber((max+min)/2)
    } else {
        min = guess
        println(guess+" Higher")
        guessNumber((max+min)/2)
    }
}
guessNumber((max+min)/2)

def guessNumber1(guess: Int): Int = {
    if (guess == myNumber) {
        guess
    } else if (guess > myNumber) {
        max = guess
        println(guess+ " Lower "+returnInput(max,true))
        guessNumber1((max+min)/2)
    } else {
        min = guess
        println(guess+" Higher"+returnInput(min,false))
        guessNumber1((max+min)/2)
    }
}

def returnInput(guess:Int, higher: Boolean):String ={
    var diff:Int=5
    var result=""
    if (higher){
        diff = guess - myNumber
    } else {
        diff = myNumber - guess
    }
    if(diff==1) {
        result+="Boiling"
    } else if(diff > 1 && diff < 5) {
        result+="Super Warm"
    } else if(diff >= 5 && diff < 10) {
        result+="Super Cold"
    } else if(diff >= 10 ) {
        result+="Freezing"
    }
    return result
}

guessNumber1((max+min)/2)
print(returnInput(45,true))