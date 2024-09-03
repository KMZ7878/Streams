package br.com.kmz;

import java.util.List;

public class Pessoa {
    private String nome;

    private String id;

    private String genero;

    private int idade;

    public Pessoa(){

    }


    public Pessoa(String nome, String id, String genero, int idade){
    this.nome = nome;
    this.id = id;
    this.genero = genero;
    this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;


    }
    public List<Pessoa> populaPessoas(){
        Pessoa pessoa1 = new Pessoa("Matheus Henrique", "p1", "Masculino", 18);
        Pessoa pessoa2 = new Pessoa("Hernandez Roja", "p2", "Masculino", 21);
        Pessoa pessoa3 = new Pessoa("Maria Julia", "p3", "Feminino", 22);
        Pessoa pessoa4 = new Pessoa("Nayara luiza", "p4", "Feminino", 22);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);

    }
}
