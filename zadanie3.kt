fun main(){
    try {
        println("Введите свой возраст")
        var a = readLine()!!.toInt()
        when (a) {
            in 0..2 -> println("Младенец")
            in 3..10 -> println("Ребенок")
            in 11..17 -> print("Подросток")
            in 18..60 -> print("Человек")
            in 61..80 -> print("Пенсионер")
            in 81..100 -> print("Старец")
            else -> println("Введено неверное число")
        }
    }catch (e:Exception){
        println("Введены неверные данные")
    }
}