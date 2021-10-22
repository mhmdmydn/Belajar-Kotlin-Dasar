fun cetakNama(firstName: String, lastName: String = ""){
    if(lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    cetakNama("Muhammad")
    cetakNama("Muhammad", "Mayudin")
}