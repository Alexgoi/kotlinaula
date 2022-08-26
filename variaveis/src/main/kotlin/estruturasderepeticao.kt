fun main(){
    val alunos = listOf("Alex", "Carlos", "João", "Maria", "Mariana", "Marcos")
    val aprovados = mutableListOf<String>()

    aprovados.add("João")
    aprovados.add("Maria")
    aprovados.add("Mariana")

    println(aprovados)
    //aprovados.remove("Maria")
    //aprovados.removeAt(2)
    //aprovados.removeIf{ aluno -> aluno.startsWith("Ma")}
    println(aprovados)

    val filtro = alunos.filter { aluno -> aluno.startsWith("Ma") }
    println(filtro)
}