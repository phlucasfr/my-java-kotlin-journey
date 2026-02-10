package fundamentos

fun main() {
    // var -> mutavel
    // val -> imutavel

    var nome = "Phelipe"
    val sobrenome = "Lucas"

    nome = sobrenome

    // val é imutavel
    // sobrenome = "teste"
}

class Variaveis {
    val nome: String = "teste"
    lateinit var sobrenome: String // aqui inicializa como um not null

    fun inicia() {
        sobrenome = "teste"
    }
}