fun jumlahkan(a: Int, b: Int): Int {
    return a + b
}

fun kurangkan(a: Int, b: Int): Int {
    return a - b
}

fun bagi(a: Int, b: Int): Int {
    if(b == 0){
        return 0
    } else {
        return  a / b
    }
}

fun main() {
    println("Penjumlahan dari 10 + 20 = ${jumlahkan(10, 20)}")
    println("Pengurangan dari 10 + 20 = ${kurangkan(10, 20)}")
    println("pembagian dari 10 + 20 = ${bagi(20, 10)}")


}