// main function
fun main() {
    val message: String? = "ll"
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
}