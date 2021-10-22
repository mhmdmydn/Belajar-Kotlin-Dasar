fun main() {
    var i = 0

    //break
    while (true){
        println("Break Me : $i")
        i++
        if (i > 100){
            break
        }
    }

    //continue
    for (i in 1..1000){
        if(i % 2 == 0){
            continue
        }
        println("Perulangan ke : $i")
    }
}