inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

fun main() {
    println(hello { "Muhammad" })
    println(hello { "Mayudin" })

    for (i in 0..100){
        println(hello { "Loop" })
    }
}