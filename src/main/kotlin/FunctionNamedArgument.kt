fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {

    //mencetak Hello Ghodel Mayudin Muhammad
    fullName(
        firstName = "Ghodel",
        lastName = "Muhammad",
        middleName = "Mayudin"
    )
}