class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome,
    cpf,
    salario
) {
    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean{
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "\nNome: '$nome'" +
                "\nCPF: '$cpf'" +
                "\nSalario: $salario" +
                "\nBonificacao: ${bonificacao()}"
    }
}