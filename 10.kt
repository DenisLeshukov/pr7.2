import kotlin.math.sqrt


fun main()
{
    try {
        println("Введите первое число")
        var n1 = readln().toDouble()
        println("Введите второе")
        var n2 = readln().toDouble()
        println("Введите третье")
        var n3 = readln().toDouble()

        when
        {
            2*n2 == n1+n3 -> {
                val d =n2-n1
                println("Эти числа являются последовательными в арифм. прогрессии, разность = $d")
            }
            else -> {
                println("Эти числа не являются последовательными в арифм. прогрессии, ")
            }

        }
    }
    catch (e:Exception){
        println("Неверный ввод")
    }


}





