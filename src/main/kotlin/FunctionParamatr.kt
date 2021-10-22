fun cetakNama(firstName: String, lastName: String?) {
    if(lastName == null){
        println("Hallo nama saya $firstName")
    }else {
        println("Hallo nama saya $firstName $lastName")
    }
}

fun main() {
    cetakNama("Muhammad", null)
    cetakNama("Muhammad", "Mayudin")
}