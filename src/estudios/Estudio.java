package estudios;

import java.util.List;
import midias.Midia;

public class Estudio {
    private int id;
    private String nome;
    private List<Midia> publicacoes;

    public Estudio(int id, String nome, List<Midia> publicacoes) {
        this.id = id;
        this.nome = nome;
        this.publicacoes = publicacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPublicacoes(List<Midia> publicacoes) {
        this.publicacoes = publicacoes;
    }
    
    public List<Midia> getPublicacoes() {
        return publicacoes;
    }
    
    public void publicar(Midia midia) {
        this.publicacoes.add(midia);
    }
}