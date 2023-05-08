package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 25));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        //Copia e colo todo a lista e joga para essa nova
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        // Ordenar pelo tempo 
        OrdernarTempo tempo = new OrdernarTempo();
        Collections.sort(aulas,tempo);
        System.out.println(aulas);
        //Criar class Anonima e ordernar por Titulo
        Collections.sort(aulas, new Comparator<Aula>() {
            @Override
            public int compare(Aula o1, Aula o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
                
            }
        });
        System.out.println(aulas);
        //Criar o Lambdas e ordenizar por tempo ao contrario
        Collections.sort(aulas, (o1, o2) -> Integer.compare(o1.getTempo(),o2.getTempo()));
        Collections.sort(aulas, (o1, o2) -> o1.getTitulo().compareTo(o2.getTitulo()));
        System.out.println(aulas);
        //System.out.println(javaColecoes);
    }
}

