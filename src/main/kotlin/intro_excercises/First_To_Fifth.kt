package intro_excercises

fun main(){
    val charac = 'a'
    println("The ascii value of ${charac} is ${charac.toInt()}")

    val quotient = 67/5
    val remainder = 30%4
    println("Quotient = $quotient")
    println("Remainder = $remainder")

    print("Enter a number: ")
    val integer = readln().toInt()
    println("You entered $integer.")
    println()

    val addition = 20+40
    println("The sum of the two digits is $addition")
    println()

    val multiplication = 90.5*34.6
    println("The product of the two floating point numbers is $multiplication")
    println()


}