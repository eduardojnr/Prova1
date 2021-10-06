/*
 * Métodos para
 * Cadastro de entrevistados (Nome | Rua)
 * Consulta de entrevistados (Filtro pelo endereço ou mostrar todos)
 * Registro da Entrevista (Nome | Respostas | Data)
 *      o Entrevistado tem que estar cadastrado
 *      o Entrevistado deve responder todas as perguntas
 * Relatório de entrevistas (Consulta por data)
 *      Nome | Rua | Descritivo | Resposta   
 */

package provaquestao1;

import java.util.Date;

public class Entrevista {
    
    /* Estudar como fazer herança -> A classe entrevista vai herdar as perguntas
     * que são objetos da classe Pergunta
     */

    private String nome;
    private String endereco;
    //private String perguntas;
    private String respostas;
    private Date data;
    
    // Construtor -> Faltando as perguntas (Comentário anterior)
    public Entrevista(String nome, String endereco, String respostas, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.respostas = respostas;
        this.data = data;
    }

    // Getter e Setter -> Faltando as perguntas (Comentários anteriores)
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