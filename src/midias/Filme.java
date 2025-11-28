package midias;

import pessoas.Criador;

public class Filme extends Midia {
    private Criador diretor;

    public Filme(int id, String titulo, int ano, String genero, int duracao, Criador diretor) {
        super(id, titulo, ano, genero, duracao);
        this.diretor = diretor;
    }

    public Criador getDiretor() {
        return diretor;
    }

    public void setDiretor(Criador diretor) {
        this.diretor = diretor;
    }
}