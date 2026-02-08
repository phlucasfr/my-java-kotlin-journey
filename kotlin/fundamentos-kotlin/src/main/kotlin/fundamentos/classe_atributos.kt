package fundamentos

class Carro (var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int)

fun main () {
    val dono = Dono("Phelipe", 32)
    val carro = Carro("Branco", 1995, dono)
    println(carro.cor)

    carro.cor = "Azul"
    println(carro.cor)

    print(carro.dono)
}