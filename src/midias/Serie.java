package midias;

import java.util.List;
import pessoas.Criador;

public class Serie extends Midia {
    private int temporadas;
    private int episodios;
    private Criador showrunner;

    public Serie(int id, String titulo, int ano, String genero, int duracao, List<Integer> avaliacoes, int temporadas, int episodios, Criador showrunner) {
        super(id, titulo, ano, genero, duracao, avaliacoes);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.showrunner = showrunner;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public Criador getShowrunner() {
        return showrunner;
    }

    public void setShowrunner(Criador showrunner) {
        this.showrunner = showrunner;
    }
}