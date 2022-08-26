import kotlin.random.Random

fun main(){
    println("Qual a sua escolha? Pedra[0] Papel[1] Tesoura[2]")
    var pedra = 0
    var papel = 1
    var tesoura = 2

    var jogador = readLine()!!.toInt()
    val comp = Random.nextInt(0,2)

    if(jogador == comp){
        println("Empatou!! $comp")
    }else if(jogador == 0 && comp == 1 || jogador == 1 && comp == 2 || jogador == 2 && comp == 0){
        println ("Você perdeu!! $comp")
    }else{
        println("Você ganhou!! $comp ")
    }
}


