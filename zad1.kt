fun main() {//1 вариант
    try {
        println("Введите первый член прогрессии")
        var num1 = readLine()!!.toDouble()
        println("Введите пятый член прогрессии")
        var num2 = readLine()!!.toDouble()
        print("Введите N член прогрессии: ")
        var n = readLine()!!.toDouble()
        var d = (num2 - num1) / 4
        var an = num1 + (n - 1) * d
        var sum = (((num1 + num2) * n) / 2)
        println("N член прогрессии = " + an)
        println("Сумма n членов прогрессии = " + sum)
    } catch (e: Exception) {
        println("ошибка")
    }
}