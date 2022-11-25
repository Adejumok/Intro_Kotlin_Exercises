package intro_excercises

fun main() {
    for (i in 1..20){
        for (j in 1 ..12){
            println("$i * $j = ${i*j}")
            if (j == 12){
                println()
            }

        }
    }
}