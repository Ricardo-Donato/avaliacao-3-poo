package pessoas;
    
public class Criador extends Pessoa{
    private String biografia;

    public Criador(int id, String nome, String email, String biografia) {
        super(id, nome, email);
        this.biografia = biografia;  
    }
    
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
