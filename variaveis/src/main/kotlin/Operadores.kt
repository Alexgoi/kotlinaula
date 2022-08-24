fun main(){
    println("Digite o valor do primeiro item: ")
    val X = readLine()!!.toInt()
    println("Digite o valor do segundo item: ")
    val Y = readLine()!!.toInt()

    val resultado = multp(X, Y)


    println("O valor dos itens é: $resultado$ reais!")
}
fun soma(X:Int, Y:Int) = X + Y

fun multp(X:Int, Y:Int) = X * Y