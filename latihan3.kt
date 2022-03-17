class Barang(val nama: String="nama", var harga: Double=999999.99, var jumlah: Int=99, var diskon: Int =99){
    val namaBrg: String
    val hargaBrg: Double
    val jumBrg: Int
    val diskonBrg: Int

    init {
        if (nama == "nama"){
            namaBrg="KOSONG"
            hargaBrg=0.0
            jumBrg=0
            diskonBrg= 0
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
        println("Diskon : $diskonBrg %")
    }

    fun hitungTotal(): Double {
        var hasil = harga * jumlah * diskon / 100
        println("Harga Diskon : $hasil")
        return harga - hasil
    }
}

fun main(array: Array<String>){
    val barang1 = Barang("ayam",15000.00,1,10)
    barang1.tampil()
    println("Harga Barang setelah Diskon : ${barang1.hitungTotal()}\n")

    val barang2 = Barang("minyak",14000.00,3,5)
    barang2.tampil()
    println("Harga Barang setelah Diskon : ${barang2.hitungTotal()}\n")

    val barang3 = Barang()
    barang3.tampil()
    println("Harga Barang setelah Diskon : ${barang3.hitungTotal()}\n")
}
