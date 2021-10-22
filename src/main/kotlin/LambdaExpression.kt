fun toUpper(value: String): String = value.uppercase()

fun main() {
    //membuat lambda expression

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    //simple parameter dengan it parameter
    val result = contohLambda("Muhammad", "Mayudin")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Mayudin"))


    //method references
    val toUpperCaseName: (String) -> String = ::toUpper//diambil dari function yang paling atas
    println(toUpperCaseName("muhammad mayudin"))
}