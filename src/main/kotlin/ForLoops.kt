fun main() {
    val names = arrayOf("Ghodel", "Muhammad", "Mayudin")

    var total = 0
    for(name in names){
        println("Name : $name")
        total++
    }

    println("Total Perulangan $total")

    //perulangan dari 1 - 1000
    for (value in 0..10){
        //println(value)
    }

    //perulangan 1000 - 0 di lanjutkan/langkah 5
    for (value in 10 downTo 0 step 5){
        //println(value)
    }

    

    val ukuranArray = names.size - 1
    println(ukuranArray)

    for (i in 0..ukuranArray){
        println("Index $i = ${names.get(i)}")
    }
}