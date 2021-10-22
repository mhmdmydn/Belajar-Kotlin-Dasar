fun main() {

    //mencetak hasil = 3.3333333333333335
    val result = 10.0 / 3.0
    println(result)

    //mencetak hasil = 15
    val result2 = 10 + 10 / 2
    println(result2)

    //augmented assignments
    var total: Int = 0

    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3

    //mencetak 600
    println(total)


    //Unary Operator
    //mencetak 601
    total++
    println(total)
    //mencetak 600
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true

    println(!sehat)

}