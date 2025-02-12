fun main(){
    try {
    println("Введите первое число")
    var a=readLine()!!.toDouble()
    println("Введите второе число")
    var b =readLine()!!.toDouble()
    when {
        (a>b)->a+1
        (b>a)->b+1
    }
    when {
        (a==b)->a=Math.pow(a, 3.0)
        (a!=b)->println("сообщение")
    }

    } catch (e:Exception){
        println("Неверный формат")
    }
}