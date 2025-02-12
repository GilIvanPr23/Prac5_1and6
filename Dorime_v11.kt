import kotlin.math.sin

fun main() {
    try {
    println("Введите значение x")
    var x= readLine()!!.toDouble()
    var f=0.0

    when {
        (x>1.1) ->f=9-x

    }
    when {
        (x < -1.1) -> f=Math.pow(sin(x), 3.0)/Math.pow(x,4.0)+1
    }
    println(f)
    }
    catch (e:Exception) {
        println("Введены неверные данные")
    }
}