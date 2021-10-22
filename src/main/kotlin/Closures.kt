fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda Increment")
        counter++
    }

    val anonymousIncrements = fun() {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement(){
        println("Anonymous Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrements()
    functionIncrement()

    println(counter)

}