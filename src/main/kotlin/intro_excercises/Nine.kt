package intro_excercises

fun main (){
    val alph = 'D'
    when(alph){
        'A','E','I','O','U' -> println("$alph is a vowel")
        else -> println("$alph is a consonant")
    }
}