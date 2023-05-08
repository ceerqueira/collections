public class Conta {
    private String nome;
    private int agencia;
    private int conta;
    private String tipoConta;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", agencia=" + agencia + ", conta=" + conta + ", tipoConta=" + tipoConta + "]\n";
    } 

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entrei");
        Conta var= (Conta)obj;
        System.out.println(var.agencia);
        if(this.agencia==var.getAgencia())
            return true;
        else if(this.conta == var.getConta())
            return true;
        else
            return true; 
    }
    
    
    
}
