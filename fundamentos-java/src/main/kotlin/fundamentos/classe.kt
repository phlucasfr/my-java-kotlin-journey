package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa.nome: ${nome}, Pessoa.idade: ${idade}"
    }
}

fun main () {
    val p1 = Pessoa("Phelipe", 32)
    println(p1)
}