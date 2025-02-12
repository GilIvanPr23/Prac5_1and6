fun main() {
    try {
    println("Введите число от 1 до 999")
    var x = readLine()!!.toDouble()
    var chet = x % 2
    when {
     x<=999 && x>0
     -> when {
     x<10 -> print("однозначное ")
        x<100 -> print("двузначное ")
        x<1000 -> print("трехзначное ")


     }

    }
        when {
            x<=999 && x>0
            -> when {
                chet == 0.0 -> print("четное число")
                chet == 1.0 -> print("нечетное число")
            }

            else -> println("Введено неверное число")
        }

    }catch (e:Exception){
        println("Введено неверные данные")
    }
}