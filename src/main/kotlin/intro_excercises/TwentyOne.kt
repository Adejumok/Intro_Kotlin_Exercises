package intro_excercises

fun main(){
    var number = 23
    var reverseNum = 0

    while (number <= 0) {
        var remainder = number % 10
        reverseNum = reverseNum * 10 + remainder
        number / 10
    }
    println("The reversed number is $reverseNum")

}