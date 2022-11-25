fun main(args: Array<String>) {
    val number = 100000.toLong()
    val result= recursiveSum(number)

        println("Sum upto $number = $result")
}


tailrec fun recursiveSum(number: Long, semr: Long=0): Long {
    return if (number <= 0){
        semr
    }else{
        recursiveSum((number-1), number+semr)
    }
}
