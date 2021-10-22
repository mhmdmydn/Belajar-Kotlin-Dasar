fun main() {

    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    //anonymous function adalah function yang tidak memiliki nama
    val upper = fun(value: String): String {
        if(value.isBlank()){
            return "Ups"
        } else {
            return value.uppercase()
        }
    }

    println(hello("Muhammad", upper))
    println(hello("", upper))

    println(hello("", fun(value: String): String {
        return value.lowercase()
    }))

}