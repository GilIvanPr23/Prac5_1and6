fun main(){
    try {
        println("Введите число")
        var a = readLine()!!.toInt()
        when (a) {
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
            else -> println("Число больше 9")
        }
    }catch(e:Exception){
        println("Неверные данные")
    }
}