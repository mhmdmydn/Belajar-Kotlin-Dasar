import java.util.*

infix fun String.to(type: String): String {
    return if(type == "UP") {
        this.uppercase(Locale.getDefault())
    }else {
        this.lowercase(Locale.getDefault())
    }
}

fun main() {

    val result = "Muhammad Mayudin" to "UP"

    println(result)
}