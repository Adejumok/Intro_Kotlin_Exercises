class Infixxx {
    infix fun convert(n: String): String {
        return n.uppercase()
    }
}

fun main(args: Array<String>){
    val j = Infixxx()
    val result = j convert "jummie"
    println("The converted string is: $result")
    print(j)
}
