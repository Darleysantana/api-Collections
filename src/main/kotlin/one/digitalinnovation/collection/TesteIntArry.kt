package one.digitalinnovation.collection

fun main() {
    val Values = IntArray(5)

    Values[0] = 1
    Values[1] = 7
    Values[2] = 6
    Values[3] = 3
    Values[4] = 2

    for (valor in Values){
        println(valor)
    }
    println("-----------------------------------------------------------")
    Values.forEach {
        println(it)
    }
    println("-----------------------------------------------------------")
   for (index in Values.indices) {
       println(Values[index])
   }
}

