import kotlin.random.Random
fun main(){
    println("vamos jogar pedra-papel-tesoura?   pedra[0]  papel[1]  tesoura[2]")
    var pedra = 0
    var papel = 1
    var tesoura = 2

    val jogador = readLine()!!.toInt()
    val comp = Random.nextInt(0,2)

    if (jogador == comp){
        println("empatou! $comp ")
    }
    else if (comp == 0 && jogador == 1 || comp == 1 && jogador == 2 || comp == 2 && jogador == 0){
        println("perdeu $comp")
    }
    else {
        println("ganhou $comp")
    }
}