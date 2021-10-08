
package provaquestao1;

public class Entrevistados {
    
    private String nome;
    private String endereco;
    
    // Construtor
    public Entrevistados(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}