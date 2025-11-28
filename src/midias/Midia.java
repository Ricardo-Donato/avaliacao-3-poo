package midias;

import java.util.List;
import java.util.ArrayList;

public class Midia {
    private int id;
    private String titulo;
    private int ano;
    private String genero;
    private int duracao;
    private List<Integer> avaliacoes;

    public Midia(int id, String titulo, int ano, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.duracao = duracao;
        this.avaliacoes = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Integer> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
    public void avaliar(int nota) {
        this.avaliacoes.add(nota);
    }
    
    public float getAvaliacao() {
        int soma = 0;
        for(int numero : this.avaliacoes) {
            soma += numero;
        }
        int tamanho = this.avaliacoes.size();
        float media = soma/tamanho;
        return media;
    }
}