package Week6_lec

interface  Organisasi {
    val namaOrg:String;
    val budgetRapat:Int;
    val jmlOrg: Int;
    val biayaKonsumsi: Int
        get()= budgetRapat * jmlOrg;

    fun rapat() ;
    fun keaktifan(){
        println("Ih kamu aktif banget");
    }
}