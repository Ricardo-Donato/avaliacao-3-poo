package app;

import estudios.Estudio;
import java.util.List;
import midias.Documentario;
import midias.Filme;
import midias.Midia;
import midias.Serie;
import pessoas.Criador;
import pessoas.Espectador;
import plataformas.PlataformaStreaming;

public class Main {

    public static void main(String[] args) {

        // ************* Criadores *************
        Criador diretor = new Criador(1, "James Cameron", "jc@gmail.com",
                "Especialista em ficção científica");
        Criador showrunner = new Criador(2, "Vince Gilligan", "vg@gmail.com",
                "Criador de séries dramáticas");
        Criador narrador = new Criador(3, "David Attenborough", "da@gmail.com",
                "Narrador de documentários sobre natureza");

      
        // ************* Espectadores *************
        Espectador usuario1 = new Espectador(101, "Ana Silva", "ana@outlook.com");
        Espectador usuario2 = new Espectador(102, "Carlos Pereira", "carlos@outlook.com");

        
        // ************* Mídias *************   
        Filme avatar = new Filme(201, "Avatar", 2009, "Ficcao Cientifica", 160, diretor);
        Serie breakingBad = new Serie(501, "Breaking Bad", 2008, "Drama", 47, 5, 62, showrunner);
        Documentario planetaTerra = new Documentario(301, "Planeta Terra", 2006, "Natureza", 50, "Vida Selvagem", narrador);

        
        // ************* Estúdio *************
        Estudio estudioBBC = new Estudio(301, "BBC Studios");
        
        estudioBBC.publicar(avatar);
        estudioBBC.publicar(breakingBad);
        estudioBBC.publicar(planetaTerra);
        System.out.println("\nMídias publicadas pelo estúdio "+estudioBBC.getNome()+":");
        for (Midia publicacao : estudioBBC.getPublicacoes()) {
            System.out.println(" - "+publicacao.getTitulo());
        }

        
        // ************* Plataforma *************
        PlataformaStreaming plataforma = new PlataformaStreaming("StreamMax");

        // ----- Registrar criadores  ------
        plataforma.registrarCriador(diretor);
        plataforma.registrarCriador(showrunner);
        plataforma.registrarCriador(narrador);

        System.out.println("\nCriadores Cadastrados");
        for (Criador criador : plataforma.getCriadores()) {
            System.out.println("- "+criador.getNome());
        }
        
         // ----- Registrar espectadores  ------
        plataforma.registrarEspectador(usuario1);
        plataforma.registrarEspectador(usuario2);
        
        System.out.println("\nEspectadores Cadastrados");
        for (Espectador espectador : plataforma.getEspectadores()) {
            System.out.println(" - "+espectador.getNome());
        }
        
        
        // ----- Registra mídias ao catálago ------
        plataforma.adicionarMidia(avatar);
        plataforma.adicionarMidia(breakingBad);
        plataforma.adicionarMidia(planetaTerra);
        
        System.out.println("\nMídias Cadastradas na Plataforma");
        for (Midia midia : plataforma.getCatalogo()) {
            System.out.println(" - "+midia.getTitulo());
        }


        
        // ************* Interações dos usuários *************
        usuario1.adicionarFavorito(avatar);
        usuario1.adicionarFavorito(breakingBad);
        usuario1.removerFavorito(avatar);  
        
        usuario2.adicionarFavorito(planetaTerra);
      
        listarMidiasFavoritas(usuario1);
        listarMidiasFavoritas(usuario2);
        

        // ************* Demonstrações de funcionalidades
        System.out.println("\nMídias de Ficção Científica ");
        List<Midia> filtradas = plataforma.buscarMidiaPorGenero("Ficcao Cientifica");
        for (Midia filtrada : filtradas) {
            System.out.println(filtrada.getTitulo());
        }

        System.out.println("\n\n***************** Buscar por título (Planeta Terra) *****************");
        Midia encontrada = plataforma.buscarPorTitulo("Planeta Terra");
        if (encontrada != null) {
            System.out.println("Mídia Encontrada: ");
            System.out.println("- Título: " + encontrada.getTitulo());
            System.out.println("- Gênero: " + encontrada.getGenero());
            System.out.println("- Ano: " + encontrada.getAno());
            System.out.println("- Duração: " + encontrada.getDuracao());
        }

    }
    
    
    public static void listarMidiasFavoritas(Espectador espectador){
          System.out.println("\nMídias Favoritas do usuário: "+espectador.getNome());
        for (Midia midiaFavorita : espectador.getAllFavoritos()) {
            System.out.println(" - "+midiaFavorita.getTitulo());
        }
    }
}
