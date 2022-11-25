package intro_excercises
import intro_excercises.gcd

fun main(){
    println(lcm(120,72))
}

fun lcm(firstNumber: Int, secondNumber: Int): Int{
    return (firstNumber*secondNumber)/ gcd(firstNumber, secondNumber)
}