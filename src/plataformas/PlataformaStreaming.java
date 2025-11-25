package plataformas;

import midias.Midia;
import pessoas.Criador;
import pessoas.Espectador;

import java.util.ArrayList;
import java.util.List;

public class PlataformaStreaming implements IPlataforma {
    private String nome;
    private List<Midia> catalogo;
    private List<Criador> criadores;
    private List<Espectador> espectadores;

    public PlataformaStreaming(String nome) {
        this.nome = nome;
        this.catalogo = new ArrayList<>();
        this.criadores = new ArrayList<>();
        this.espectadores = new ArrayList<>();
    }

    @Override
    public void adicionarMidia(Midia midia) {
        this.catalogo.add(midia);
    }

    @Override
    public Midia buscarPorTitulo(String titulo) {
        for (Midia midia : catalogo) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                return midia;
            }
        }
        return null;
    }

    public List<Midia> buscarMidiaPorGenero(String genero) {
        List<Midia> midiasPorGenero = new ArrayList<>();
        for (Midia midia : catalogo) {
            if (midia.getGenero().equalsIgnoreCase(genero)) {
                midiasPorGenero.add(midia);
            }
        }
        return midiasPorGenero;
    }

    public void registrarCriador(Criador criador) {
        this.criadores.add(criador);
    }

    public List<Criador> getCriadores() {
        return criadores;
    }

    public void registrarEspectador(Espectador espectador) {
        this.espectadores.add(espectador);
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Midia> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Midia> catalogo) {
        this.catalogo = catalogo;
    }

    public void setCriadores(List<Criador> criadores) {
        this.criadores = criadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
}
