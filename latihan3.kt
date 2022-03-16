import kotlin.math.roundToInt

class Barang(val nama: String="nama", var harga: Double=999999.999, var jumlah: Int=99, var diskon: Double =99999.99){
    val namaBrg: String
    val hargaBrg: Double
    val jumBrg: Int
    val diskonBrg: Double

    init {
        if (nama == "nama"){
            namaBrg="KOSONG"
            hargaBrg=0.0
            jumBrg=0
            diskonBrg=0.0
        } else{
            namaBrg=nama.toUpperCase()
            hargaBrg= harga
            jumBrg= jumlah
            diskonBrg= diskon
        }
    }
    fun tampil(){
        println("Nama : $namaBrg")
        println("Harga : $hargaBrg")
        println("Jumlah : $jumBrg")
        println("Diskon : $diskonBrg")
    }

    fun hitungTotal(): Double {
        val hasil = harga*jumlah*diskon
        return hasil
    }
}

fun main(array: Array<String>){
    val barang1 = Barang("ayam",15000.00,1,0.5)
    barang1.tampil()
    println("Harga Diskon: ${barang1.hitungTotal()}\n")

    val barang2 = Barang("minyak",14000.00,3,0.5)
    barang2.tampil()
    println("Harga Diskon: ${barang2.hitungTotal()}\n")

    val barang3 = Barang()
    barang3.tampil()
    println("Harga Diskon: ${barang3.hitungTotal()}\n")
}