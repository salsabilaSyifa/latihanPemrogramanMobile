import kotlin.math.pow

fun pangkat(x:Int, y:Int): Double {
    val base = x
    val exponent = y
    val result = base.toDouble().pow(exponent.toDouble())
    return result
}

fun main(args: Array<String>) {
    println("4 pangkat 3 = ${pangkat(4,3)}")
}