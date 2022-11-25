fun main(){
    val func = operation()
    println(func(4))
}
//function 1
fun square(x: Int) = x * x

//function 2
fun operation(): (Int) -> Int {
    return :: square
}
