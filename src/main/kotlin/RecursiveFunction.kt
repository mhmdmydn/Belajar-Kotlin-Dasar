fun main() {
    //Factorial For loop

    fun factorialLoop(value: Int): Int {
        var result = 1

        for (i in value downTo 1){
            result *= i
        }

        return result
    }

    println(factorialLoop(10))


    //factorial recursive
    //function yang memanggil function itu sendiri didalam blok
    fun factorialRecursive(value: Int): Int {
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value -1)
        }
    }

    println(factorialRecursive(10))
}