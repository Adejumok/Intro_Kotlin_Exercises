package intro_excercises

fun main() {
    val fibonacci = 10
    println("The fibonacci sequence for $fibonacci terms are: ")
    println(getFibonacci(fibonacci))

}

fun getFibonacci(term:Int){
    var firstDigit=0
    var secondDigit=1
    var i = 1
    while (i <= term){
        print("$firstDigit, ")
        val nextDigit = firstDigit + secondDigit
        firstDigit = secondDigit
        secondDigit = nextDigit
        i++
    }


}