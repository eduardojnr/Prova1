
package provaquestao1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           
        int menu;
        
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        do {
            exibirMenu();
            menu = entrada.nextInt();
            System.out.println("");
            
            switch(menu) {
                
                case 1: // Cadastro de entrevistados (Nome | Rua)
                    break;
                    
                case 2: // Consulta de entrevistados (Filtro por Rua ou S/ Filtro)
                    break;
                    
                case 3: // Cadastro de perguntas (ID | Descritivo)
                    break;
                    
                case 4: // Consulta de perguntas (Exibir todas)
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