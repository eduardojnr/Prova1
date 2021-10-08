
package provaquestao1;

public class Perguntas {
    
    private int id;
    private String descritivo;

    // Construtor
    public Perguntas(int id, String descritivo) {
        this.id = id;
        this.descritivo = descritivo;
    }
    
    // Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }   
}