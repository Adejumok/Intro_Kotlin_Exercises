fun factorial(n : Int):Long {
    return if(n == 1) n.toLong()
    else n * factorial(n-1)
}

fun main(){
    println(factorial(10))
}