fun String.hello(): String = "Hello $this"

fun main() {
    val name = "Mayudin"
    println(name.hello())
    println("Muhammad".hello())
}