
public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero ){
        this.setConta(numero);
        this.setAgencia(agencia);
        this.setTipoConta("Conta Corrente");
    }

}
