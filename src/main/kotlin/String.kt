fun main() {
    var firstName: String = "Muhammad"
    var lastName: String = "Mayudin"

    var address: String = """
        Jalan belum jadi, RT 01 RW 01
        Kabupaten Subang
        Jawa Barat
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)


    //menggabungkan string
    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName total : ${fullName.length}"
    println(desc)
}