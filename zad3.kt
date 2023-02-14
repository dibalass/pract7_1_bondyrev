import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.pow

fun main() {//6(8) вариант
    try {
        println("введи a")
        var a = readLine()!!.toDouble()
        println("введи b")
        var b = readLine()!!.toDouble()
        println("введи c")
        var c = readLine()!!.toDouble()
        println("введи d")
        var d = readLine()!!.toDouble()
        println("введи n")
        var n = readLine()!!.toDouble()
        var z: Double = (0.25 * (a - b)) / ((1 / 8) - (abs(b) / (10.0.pow(n + 3) + (log10(b) / (c - d)))))
        println(z)
    } catch (e: Exception) {
        println("ошибка")
    }
}