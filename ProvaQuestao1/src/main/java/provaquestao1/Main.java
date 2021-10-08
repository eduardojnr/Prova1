
package provaquestao1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Entrevistados> listaEntrevistados = new ArrayList<>();
        Entrevistados objEntrevistados;
        
        ArrayList<Perguntas> listaPerguntas = new ArrayList<>();
        Perguntas objPerguntas;
        
        ArrayList<Entrevistas> listaEntrevistas = new ArrayList<>();
        Entrevistas objEntrevistas;
        
        int menu;
        
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        do {
            exibirMenu();
            menu = entrada.nextInt();
            System.out.println("");
            
            switch(menu) {
                
                case 1: // Cadastro de entrevistados (Nome | Rua)
                    
                    System.out.println("Entrando no Cadastro de Entrevistados");
                    
                    System.out.println("Insira o nome do Entrevistado ou 0 para sair");
                    String nome = entradaString.nextLine();
                    
                    if (nome.equalsIgnoreCase("0")){
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Insira o endereço do Entrevistado ou 0 para sair");
                        String endereco = entradaString.nextLine();
                        if (endereco.equalsIgnoreCase("0")){
                            System.out.println("");
                            break;
                        } else {
                            objEntrevistados = new Entrevistados(nome, endereco);
                            listaEntrevistados.add(objEntrevistados);
                            System.out.println("");
                            break;
                        }
                    }
                    
                case 2: // Consulta de entrevistados (Filtro por Rua ou S/ Filtro)
                    
                    System.out.println("Deseja aplicar algum fitro?\nSIM\nNÃO\n...........");
                    String opcao = entradaString.nextLine();
                    if (opcao.equalsIgnoreCase("NÃO")){
                        for(int i = 0; i < listaEntrevistados.size(); i++){
                            System.out.println("Nome: " + listaEntrevistados.get(i).getNome());
                            System.out.println("Endereço: " + listaEntrevistados.get(i).getEndereco());
                            System.out.println("=====================");}
                    }
                    
                    if (opcao.equalsIgnoreCase("SIM")){
                        System.out.println("Insira o endereço de filtro:");
                        opcao = entradaString.nextLine();
                        if (!(listaEntrevistados.isEmpty())){
                            for(int i = 0; i < listaEntrevistados.size(); i++){
                                if ((listaEntrevistados.get(i).getEndereco()).equalsIgnoreCase(opcao)){
                                    System.out.println("Entrevistados residentes na rua " + opcao);
                                    System.out.println("Nome: " + listaEntrevistados.get(i).getNome());
                                    System.out.println("=====================");
                                } else {
                                    System.out.println("Nenhum entrevistado reside nessa rua.\n");
                                } 
                            }
                        } else {
                            System.out.println("Nenhum entrevistado cadastrado.\n");
                        }
                    }
                    break;
                    
                case 3: // Cadastro de perguntas (ID | Descritivo)
                    
                    System.out.println("Entrando no Cadastro de Perguntas");
                    
                    System.out.println("Insira o ID da pergunta ou 0 para sair");
                    int id = entrada.nextInt();
                    
                    if (Integer.toString(id).equalsIgnoreCase("0")){
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Descritivo da Pergunta ou 0 para sair ");
                        String descritivo = entradaString.nextLine();
                        if (descritivo.equalsIgnoreCase("0")){
                            System.out.println("");
                            break;
                        } else {
                            objPerguntas = new Perguntas(id, descritivo);
                            listaPerguntas.add(objPerguntas);
                            System.out.println("TESTE");
                            break;
                        }
                    }
                    
                case 4: // Consulta de perguntas (Exibir todas)
                    
                    if (!listaPerguntas.isEmpty()){
                        for(int i = 0; i < listaPerguntas.size(); i++){
                            System.out.println("ID: " + listaPerguntas.get(i).getId());
                            System.out.println(listaPerguntas.get(i).getDescritivo());
                            System.out.println("=====================");}
                    } else {
                        System.out.println("Não existem perguntas cadastradas.\n");
                    }
                    
                    break;
                    
                case 5: // Registro da Entrevista (Nome|Respostas|Data)
                    break;
                    
                case 6: // Relatório de Entrevistas (Filtro por Data)
                    break;
                    
                case 0: // Encerrar programa
                    break;
                    
                default: // Tratamento
                    System.out.println("Entrada inválida.\n");
            }
            
        } while (menu!= 0); 
    }
    
    static void exibirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastro de Entrevistados");
        System.out.println("2 - Consulta de Entrevistados");
        System.out.println("3 - Cadastro de Perguntas");
        System.out.println("4 - Consulta de Perguntas");
        System.out.println("5 - Registro da Entrevista");
        System.out.println("6 - Relatório de Entrevistas");
    }
}