package pessoas;

import midias.Midia;
import java.util.ArrayList;
import java.util.List;

public class Espectador extends Pessoa {
    private List<Midia> favoritos;

    public Espectador(int id, String nome, String email) {
        super(id, nome, email);
        this.favoritos = new ArrayList<>();
    }

    public void adicionarFavorito(Midia midia) {
        this.favoritos.add(midia);
    }

    public void removerFavorito(Midia midia) {
        this.favoritos.remove(midia);
    }

    public List<Midia> getAllFavoritos() {
        return this.favoritos;
    }

    public void setFavoritos(List<Midia> favoritos) {
        this.favoritos = favoritos;
    }
}