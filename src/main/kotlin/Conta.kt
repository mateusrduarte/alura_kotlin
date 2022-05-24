class Conta(val titular: String, val numero: Int, val saldoInicial: Double = 0.0) {

    var saldo = saldoInicial
        private set


    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (saldo > 0) {
            saldo -= valor
        }
    }

    fun trasferir(valor: Double, destino: Conta): Boolean {
        if (valor > 0) {
            sacar(valor)
            destino.depositar(valor)
            return true
        }

        return false
    }

    override fun toString(): String {
        return "\nTitula: '$titular', \n" +
                "Numero: $numero, \n" +
                "Saldo: $saldo"
    }
}