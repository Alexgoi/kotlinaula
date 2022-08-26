import kotlin.random.Random

fun main(){
    //declarações de coleções
    val alunos:List<String> = listOf<String>("joão", "maria", "josé", "paola")

    val aprovados:MutableList<String> = mutableListOf()

    //adição de elementos
     aprovados.add("josé")
    aprovados.add("joão ")
    aprovados.add("paola")
    aprovados.add("maria")

    //remover elementos
    //aprovados.remove("joão")
    //aprovados.removeAt(2)
   aprovados.removeIf{
       elemento -> elemento.startsWith("jo",true)
   }

    //println(aprovados)

    // filtrac elementos
    var filtro = alunos.filter {
        aluno -> aluno.contains("a")
    }
    println(filtro)
}
