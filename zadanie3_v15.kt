fun main() {
    try {


        println("Введите год")
        var n = readLine()!!.toInt()

        when {
            ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) -> println("Введенный год високосный")
            else -> println("Введенный год не високосный")
        }


    }catch (e:Exception) {
        println("Введено неверное число")
    }
}