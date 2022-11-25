package intro_excercises

import java.util.Scanner

fun main() {
    val word = "Jide"
    val cha = 'e'
    var freq = 0
    for (item in word){
        if(cha== item){
            ++freq
        }
    }
    println("Frequecy of $cha = $freq")
}