package intro_excercises

fun main() {
    print("Enter a year to check if it is a leap year: ")
    val year = readln().toInt()
    if ((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
        print("$year is a leap year.")
    }else print("$year isn't a leap year.")
}