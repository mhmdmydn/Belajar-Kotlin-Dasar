fun main() {
    fun sayHelloIf(name: String = ""): String{
        return if (name == ""){
            "Hello Bro!"
        }else {
            "Hello $name"
        }
    }
    fun sayHelloWhen(name: String = ""): String{
        return when (name){
            "" -> "Hello Bro!"
            else  -> return "Hello $name"
        }
    }

    println(sayHelloIf())
    println(sayHelloIf("Muhammad Mayudin"))

    println(sayHelloWhen())
    println(sayHelloWhen("Muhammad Mayudin"))
}