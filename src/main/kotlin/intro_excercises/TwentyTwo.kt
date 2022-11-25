package intro_excercises

fun main() {
    val number = 4
    var power = 5
    var result: Long = 1

    println("The baseValue value and the exponentValue are defined as $number and $power respectively")

    while (power != 0) {
        result *= number.toLong()
        --power
    }
    println("The result is: $result")
}