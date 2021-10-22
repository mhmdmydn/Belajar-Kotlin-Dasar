fun main() {
    val member: Array<String> = arrayOf("Muhammad", "Mayudin", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 85)

    member[1] = "mhmd"
    //print string
    println(member[1])

    //print Byte
    println(values[0])
    println(values[1])
    println(values[2])


    //array nullable
    val members: Array<String?> = arrayOfNulls(5)

    members[0] = "Muhammad"
    members[1] = "Muhammad"
    members[2] = "Muhammad"
    members[3] = "Muhammad"
    members[4] = "Muhammad"
    println(members.size)
}