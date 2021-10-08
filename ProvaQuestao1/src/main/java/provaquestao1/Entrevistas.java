
package provaquestao1;

import java.util.Date;

public class Entrevistas extends Entrevistados{
    
    private String respostas;
    private Date data;
    
    // Construtor
    public Entrevistas(String nome, String endereco, String respostas, Date data) {
        
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}