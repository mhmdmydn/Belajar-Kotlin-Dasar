fun main() {
    //val range = 1..1000
    //range terbalik
    //val range = 1000 downTo 1

    //kenaikan data
    val range = 1000 downTo 1 step 5

    //operasi range
    println(range.count()) //melihat berapa banyak
    println(range.contains(50)) //melihat apakah ada 50 di range
    println(range.contains(2000)) //melihat apakah ada 2000 di range
    println(range.first) //melihat angka pertama
    println(range.last) //melihat data terakhir
    println(range.step) //melihat data selanjutnya

}