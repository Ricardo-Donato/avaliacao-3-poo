package midias;

import pessoas.Criador;

public class Documentario extends Midia {
    private String tema;
    private Criador narrador;

    public Documentario(int id, String titulo, int ano, String genero, int duracao, String tema, Criador narrador) {
        super(id, titulo, ano, genero, duracao);
        this.tema = tema;
        this.narrador = narrador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Criador getNarrador() {
        return narrador;
    }

    public void setNarrador(Criador narrador) {
        this.narrador = narrador;
    }
}