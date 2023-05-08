public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero ){
        this.setConta(numero);
        this.setAgencia(agencia);
        this.setTipoConta("Conta Corrente");
    }
    
}
