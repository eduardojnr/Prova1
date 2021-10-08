
package provaquestao1;

public class Entrevistas extends Entrevistados{
    
    private String respostas;
    private String data;
    
    // Construtor
    public Entrevistas(String nome, String endereco, String data, String respostas) {
        
        super(nome, endereco);
        this.respostas = respostas;
        this.data = data;
    }

    // Getter e Setter
    public String getRespostas() {
        return respostas;
    }

    public void setRespostas(String respostas) {
        this.respostas = respostas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}