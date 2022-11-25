package intro_excercises

fun main() {
    var number = 6790546
    println("There are ${digitCount(number)} digits in $number")
}

fun digitCount(number:Int):Int{
    var count = 0
    var tempNumber = number
    while (tempNumber != 0){
        tempNumber/=10
        count++
    }
   return count
}