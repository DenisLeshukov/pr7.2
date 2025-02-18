fun main()
{
    try {


        println("Введите x1")
        var x1 = readln().toDouble()
        println("Введите y1")
        var y1 = readln().toDouble()
        println("Введите x2")
        var x2 = readln().toDouble()
        println("Введите y2")
        var y2 = readln().toDouble()

        when
        {
            ((x1<=0)||(x2<=0)||(y1<=0)||(y2<=0)) -> {
                println("Введите число больше 0")
            }
        }

        val xMin = when
        {
            x1>=0->x1
            else-> 0.0
        }
        val yMin = when
        {
            y1>=0->y1
            else-> 0.0
        }
        val xMax = when
        {
            x2>=0->x2
            else-> 0.0
        }
        val yMax = when
        {
            y2>=0->y2
            else-> 0.0
        }
        val area = when{
            xMax > xMin && yMax>yMin -> (xMax - xMin) * (yMax - yMin)
            else-> 0.0
        }
        println("Площадь прямоугольника в первой четверти $area")
    }
    catch (e:Exception){
        println("Неверный ввод")
    }
}