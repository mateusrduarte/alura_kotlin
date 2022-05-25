fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        "Alex",
        "000.000.000-00",
        1000.0
    )

    val fran = Gerente(
        "Fran",
        "111.111.111-11",
        2000.0,
        1234
    )

    println( alex.toString())
    println(fran.toString())

    if (fran.autentica(1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }
}