package intro_excercises

fun main(){
    var firstNum = 34
    var secondNum = 78
    var temp = 0

    temp = firstNum
    firstNum = secondNum
    secondNum = temp

    println("First Number = $firstNum")
    println("Second Number = $secondNum")

}