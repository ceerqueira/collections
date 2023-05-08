import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    int idade = 29;

    Integer num = Integer.valueOf(idade);
    System.out.println(num);
        List<String> lista = new ArrayList<>();
        lista.add("6");
        lista.add("2");
        lista.add("3");
        //Classe anonimas 

        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String c1, String c2){
                                        return c1.compareTo(c2);
                                    }

                                }
            );

            System.out.println(lista);
            //Lambada
        lista.sort((c1,c2) -> {
            return c2.compareTo(c1);
        });

    System.out.println(lista);

    }
}
