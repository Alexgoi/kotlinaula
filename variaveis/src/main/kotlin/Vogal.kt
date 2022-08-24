fun main(){
    println("Digite a letra: ")
    val letra = readLine()!!.toString()
    val eVogal = letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U"
    if (eVogal)
        println("A letra $letra é uma vogal!")
    else
        println("A letra $letra é uma consoante!")
}