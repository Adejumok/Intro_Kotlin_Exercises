package intro_excercises

fun main() {
    print("Enter the number: ")
    val number= readln().toInt()
    print(factorial(number))
}

fun factorial(n : Int):Long {
    return if(n == 1) n.toLong()
    else n * factorial(n-1)
}