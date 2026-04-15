package week8_lecture

fun main() {
    var nama: String? = null;

    try {
        println("nama kamu ${nama!!.uppercase()}")
        val hitungan = 10/0;
    }catch(ex:Exception){
        println("errornya adalah ${ex.message}");
    }

    var dataMhs: List<Any> = listOf(123,"Sam",89,"Tangerang")
    for(item in dataMhs) {
        var itemFilter = item as? String
        if(itemFilter!=null) {
            println(itemFilter);
        }
    }
}