fun main() {
    val finalExam = 'A'

    when(finalExam){
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Tru again next year")
        else -> println("Ups")
    }

    val nilai = 'C'

    when(nilai){
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        'E' -> {
            println("Tru again next year")
        }
        else -> {
            println("Ups")
        }
    }

    //short inline code
    when(nilai){
        'A', 'B', 'C', 'D', 'E' -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Try again next year")
        }
    }

    //array when expression
    val passValues = arrayOf('A', 'B', 'C', 'D', 'E')

    when(nilai){
        in passValues -> {
            println("Anda lulus")
        }
        !in passValues -> {
            println("Anda tidak lulus")
        }
    }

    //String when expression

    val name = "Muhammad Mayudin"

    when(name){
        is String -> {
            println("Name is string")
        }
        !is String -> {
            println("Name is not string")
        }
    }

    val nilai2 = 90
    //when penganti if else
    when {
        nilai2 > 80 -> println("Amazing")
        nilai2 > 70 -> println("Good Job")
        nilai2 > 60 -> println("Not bad")
        else -> println("Try again")
    }

}