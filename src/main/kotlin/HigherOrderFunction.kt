
fun main() {


    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.uppercase()}

    println(hello("Mayudin", lambdaUpper))

    println(hello("MUHAMMAD") { value: String -> value.lowercase() })

    val result  = hello("Joko"){value: String ->
        value.uppercase()
    }

    println(result)
}