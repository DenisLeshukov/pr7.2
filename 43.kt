fun main() {
    try{
        println("Введите k1")
        var k1 = readln().toDouble()
        println("Введите b1")
        var b1 = readln().toDouble()
        println("Введите k2")
        var k2 = readln().toDouble()
        println("Введите b2")
        var b2 = readln().toDouble()
        println("Введите e")
        var e = readln().toDouble()


        when {
            k1 == k2 && b1 == b2 -> {
                println("Прямые совпадают.")

                when {
                    (Math.abs(b1) < e)-> {
                        println("Точка пересечения находится в e-окрестности начала координат.")
                    }
                    else -> {
                        println("Точка пересечения не находится в e-окрестности начала координат.")
                    }

                }
            }
            k1 == k2 -> {
                println("Прямые параллельны и не пересекаются.")
            }
            else -> {

                val xIntersection = (b2 - b1) / (k1 - k2)
                val yIntersection = k1 * xIntersection + b1


                when{
                    (Math.abs(xIntersection) < e && Math.abs(yIntersection) < e) -> {
                        println("Точка пересечения ($xIntersection, $yIntersection) находится в e-окрестности начала координат.")
                    }
                    else ->{
                        println("Точка пересечения ($xIntersection, $yIntersection) не находится в e-окрестности начала координат.")
                    }

                }
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}