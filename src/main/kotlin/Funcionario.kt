class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    var bonificacao = 100.0

    override fun toString(): String {
        return "\nNome: '$nome'" +
                "\nCPF: '$cpf'" +
                "\nSalario: $salario" +
                "\nBonificacao: $bonificacao"
    }


}