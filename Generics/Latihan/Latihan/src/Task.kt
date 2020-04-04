// Coming Soon
fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println("String result: ${stringResult}")
    println("Int result: ${intResult}")
}

// TODO 1
fun <T> getResult(args: T): Int {
    when(args){
        is String -> return args.length
        is Int -> return args*5
        else -> return 0
    }
}