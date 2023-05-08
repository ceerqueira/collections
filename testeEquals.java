import java.util.ArrayList;

public class testeEquals {
    public static void main(String[] args) {
        ArrayList<Conta> listaConta = new ArrayList<>();
        Conta ctt1 = new ContaCorrente(22, 11);
        listaConta.add(ctt1);
        ctt1.setNome("Alfredo");
        Conta ctt2 = new ContaPoupanca(22, 11);
        listaConta.add( ctt2);
        ctt2.setNome("Bernado");
        var var = listaConta.get(0);
        boolean existe = var.equals((Object)ctt2);
        System.out.println("Existe?: "+ existe);

        int num = Integer.parseInt("3");
        System.out.println(num);


    }
    
}
