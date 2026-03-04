package week5

fun main() {
    val listMatkul: List<MataKuliah> = listOf (
        Wajib(),
        Elective()
    );
    println("banyak tipe matkul: $listMatkul");

     //panggil method anak-anak -> si set_matkul()
     for(mku in listMatkul) {
         mku.set_matkul(3);

         //cara pertama panggil method yang beda untuk all anak class
         if(mku is Wajib){
             mku.ada_seminar();
         } else if (mku is Elective){
             mku.ada_praktek();
         }

         //cara kedua panggil method yg beda
         when(mku) {
             is Wajib -> {
                 print("Wajib dari when")
                 mku.ada_seminar();
             }
             is Elective -> {
                 print("Elective dari when")
                 mku.ada_praktek();
             }
         }
     }

   // val wjb = Wajib()
    // wjb.set_matkul(3);

   // val elc = Elective();
   // elc.set_matkul(2);
}