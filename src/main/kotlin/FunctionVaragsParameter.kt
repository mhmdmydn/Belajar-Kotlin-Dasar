//varargs artinya datanya bisa menerima lebih dari suatu input, atau anggap saja semacam Array.
fun hitungTotal(values: Array<Int>): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}

fun hitungTotalVararg(vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return total
}


fun main() {

    //mencetak 40
    val values = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(values)
    println(result)


    //mencetak 90
    val resultVararg = hitungTotalVararg(10, 10, 10 ,10, 10 , 10 ,10 ,10, 10)
    println(resultVararg)

}