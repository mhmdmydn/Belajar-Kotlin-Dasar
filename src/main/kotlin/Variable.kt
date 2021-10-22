const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var firstName: String = "Muhammad"
    var lastName: String = "Mayudin"

    lastName = "Maman"

    println("$firstName $lastName")

    //nullable =  variable yang boleh kosong
    var name: String? = null

    println(name)
    println(name?.length)

    //constant = immutable data yang biasanya diakses untuk keperluan global
    println("Welcome to $APP version $VERSION")
}