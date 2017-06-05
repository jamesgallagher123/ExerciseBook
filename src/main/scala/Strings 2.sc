def replaceChar (string1: String, string2: String, char1: Char, char2: Char): String = {
    var concatString: String = string1.concat(string2)
    var outputString: String = concatString.replace(char1, char2)
    return outputString
}

replaceChar("Ha", "llo", 'a', 'e')