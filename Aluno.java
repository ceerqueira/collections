package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Aluno {

    private String nome;
    private int numeroMatricula;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();


    public Aluno(String string, int i) {
        if (string == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = string;
        this.numeroMatricula = i;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString() {
        return "[Aluno: "+ this.getNome()+ " matricula: "+ this.getNumeroMatricula() +"]";
    }

    //Sempre que mudar o equal em set tenho que implementar o hashcode
    @Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno)obj;
		return this.nome.equals(outro.getNome());
	}
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
    
    
}
