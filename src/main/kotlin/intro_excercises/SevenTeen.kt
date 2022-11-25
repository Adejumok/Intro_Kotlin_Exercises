package intro_excercises

fun main(){
    println(gcd(12,8))
}

fun gcd(firstNumber: Int, secondNumber: Int): Int{
    var highestDiv = 1
    for (i in 1..firstNumber){
        for (i in 1..secondNumber){
            if (firstNumber % i == 0 && secondNumber % i == 0){
                highestDiv = i
        }
        }
    }
    return highestDiv
}