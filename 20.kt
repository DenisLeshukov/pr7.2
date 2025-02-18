fun main()
{
    try {


        println("Введите x")
        var x = readln().toDouble()
        println("Введите a")
        var a = readln().toDouble()
        println("Введите R")
        var r = readln().toDouble()
        var y: Any = 0


        when
        {
            y == 0 -> {
                y = 1 - Math.abs(x)
                println("Для первого графика y= $y")
                y = a - Math.abs(x)
                println("Для второго графика y= $y")
                y = r*r-x*x
                println("Для третьего графика y^2= $y")
                y = r/3
                println("Для третьего графика y= $y")
            }

        }
    }
    catch (e:Exception){
        println("Неверный ввод")
    }
}