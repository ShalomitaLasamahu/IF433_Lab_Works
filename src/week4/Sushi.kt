package week4

class Sushi: Makanan() {
    private var jenis:String = "";
    public fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns;
        super.harga = jml * 100;
        println("Sushi $jenis laku $harga");
    }
}