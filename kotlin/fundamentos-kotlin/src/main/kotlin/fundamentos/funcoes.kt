package fundamentos

// Unit o pseudo void, na real nem precisa declarar :Unit se não for retornar nada.. só curiosidade kkk
fun main(): Unit {
    // essa bagaça aceita o parametro fora de ordem.... que lindo :)
    val nome = retornaNome(nome = "Phelipe")

    println(nome)
}

// Aqui se quiser aceita valor padrão no argumento :)
fun retornaNome(nome: String): String {
    return "Oi " + nome
}