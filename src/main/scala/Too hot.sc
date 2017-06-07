def tooHot (temperature: Int, isSummer: Boolean): Boolean = {
    if (temperature >= 60 && temperature <= 90) {
        return true
    } else if (temperature >= 60 && temperature <=100 && isSummer == true ) {
        return true
    } else {
        return false
    }
}

tooHot(80,false)
tooHot(100,false)
tooHot(100,true)