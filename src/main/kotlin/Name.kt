fun fir(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    return sum.toInt()
}
fun main(args: Array<String>) {
    val num1 = 23.7
    val num2 = 78.0
    val result: Int = fir(num1, num2)
    println(result)
}