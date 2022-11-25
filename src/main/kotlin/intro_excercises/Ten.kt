package intro_excercises

fun main() {
    print("Enter the first number: ")
    val first= readln().toInt()
    print("Enter the second number: ")
    val second= readln().toInt()
    print("Enter the third number: ")
    val third= readln().toInt()

    var largest = if (first > second && first > third){
        first
    }else if (second > first && second > third){
        second
    }else
        third

    println("The largest number is $largest")
}