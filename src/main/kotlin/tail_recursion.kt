import java.math.BigInteger

fun main(){
    val longNum = 200
    val answer= tailrec_(longNum)
    println("The tail recursion of ${longNum.toBigInteger()} is "+answer)
}

tailrec fun tailrec_(n:Int, semiresult:Int = 1): Int{
    return if (n == 1){
        semiresult
    }
    else{
        tailrec_(n-1,n*semiresult)
    }
}