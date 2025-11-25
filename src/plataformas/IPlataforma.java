package plataformas;

import midias.Midia;

public interface IPlataforma {
    void adicionarMidia(Midia midia);
    Midia buscarPorTitulo(String titulo);
}