package intro_excercises

fun main(){
    print("Enter a number: ")
    val num = readln().toInt()
    if (num % 2 == 0) println("You entered an even number.") else println("You entered an odd number.")
}