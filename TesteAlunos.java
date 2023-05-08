package br.com.alura;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class TesteAlunos {
    public static void main(String[] args) {
        //Set = Conjunto, set é interface
        Set<String> alunos = new HashSet<>();
        alunos.add("Victor");
        alunos.add("Rodrigo");
        alunos.add("Roberto");
        alunos.add("Alfredo");
        alunos.add("Renan");
        alunos.add("Mauricio");

        System.out.println(alunos);
        // Você ñ tem garantia da ordem dentro desse conjunto (SET)
        //Garante que só tem um objeto dentro do conjunto; mesmo usando set.size;
/* 
        for (String string : alunos) {
            System.out.println(string);
            
        } */
/*         alunos.forEach(aluno -> {
            System.out.println(aluno);
        }); */

        //NO set a velocidade é muito maior que o List 
        boolean temessealuno= alunos.contains("Victor");
        alunos.remove("Victor");

        // é comum usar varias listas ao mesmo tempo
    
    }
}
