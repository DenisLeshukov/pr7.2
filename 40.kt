fun main() {
    try{
        println("Введите k")
        var k = readln().toDouble()
        println("Введите b")
        var b = readln().toDouble()
        println("Введите a")
        var a = readln().toDouble()
        println("Введите l")
        var l = readln().toDouble()

        val d = k * k + 4 * a * b
        when{
            (d < 0) ->{
                println("Прямая и парабола не пересекаются")
                return
            }
        }


        val sqrtD = Math.sqrt(d)
        val x1 = (k + sqrtD) / (2 * a)
        val x2 = (k - sqrtD) / (2 * a)

        val y1 = k * x1 + b
        val y2 = k * x2 + b


        val halfL = l / 2
        val point1InSquare = Math.abs(x1) <= halfL && Math.abs(y1) <= halfL
        val point2InSquare = Math.abs(x2) <= halfL && Math.abs(y2) <= halfL

        when {
            point1InSquare && point2InSquare -> {
                println("Обе точки попадают в квадрат.")
                println("Точка 1: ($x1, $y1)")
                println("Точка 2: ($x2, $y2)")
            }
            point1InSquare -> {
                println("Только точка 1: ($x1, $y1) попадает в квадрат.")
                println("Точка 2: ($x2, $y2) не попадает в квадрат.")
            }
            point2InSquare -> {
                println("Только точка 2: ($x2, $y2) попадает в квадрат.")
                println("Точка 1: ($x1, $y1) не попадает в квадрат.")
            }
            else -> {
                println("Не все точки попадают в квадрат.")
                println("Точка 1: ($x1, $y1) не попадает в квадрат.")
                println("Точка 2: ($x2, $y2) не попадает в квадрат.")
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }



}