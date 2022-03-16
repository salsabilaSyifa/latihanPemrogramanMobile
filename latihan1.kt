fun jarak(x1:Int, y1:Int, x2:Int, y2:Int): Double{
    val t1 = intArrayOf(x1,y1)
    val t2 = intArrayOf(x2,y2)

    val hasil = Math.sqrt(Math.pow((t1[0]-t2[0]).toDouble(), 2.0) + Math.pow((t1[1]-t2[1]).toDouble(), 2.0))
    return hasil }

fun main(args: Array<String>){
    println("Jarak antara t1(2,3) dan t2(8,7)")
    println(java.lang.String.format("Hasil; %.3f", jarak(2,3,8,7)))

    println("Jarak antara t1(5,3) dan t2(-8,-4)")
    println(java.lang.String.format("Hasil; %.3f", jarak(5,3,-8,-4))) }