// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get() = field
        set(new) {
            println("Fungsi setter dipanggil")
            field = new
        }

    fun get(): Boolean {
        println("Fungsi getter dipanggil")
        return this.sleep
    }

    fun toSleep() {
        when(this.get()){
            true -> println("${this.name}, sleep!")
            false -> println("${this.name}, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}