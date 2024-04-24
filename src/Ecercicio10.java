import java.util.Scanner;

public class Ecercicio10 {
    

    //Escrever um programa que possibilite calcular a área total em metros de uma residência
    // com os cômodos sala, cozinha, banheiro, dois quartos, área de serviço, quintal, garagem,
    // entre outros que podem ser fornecidos ao programa.
    // O programa deve solicitar a entrada do nome, da largura e do comprimento de um determinado cômodo.
    // Em seguida, deve apresentar a área do cômodo lido
    // e também uma mensagem solicitando ao usuário a confirmação de continuar calculando novos cômodos.
    // Caso o usuário responda “NÃO”, o programa deve apresentar o valor total acumulado da área residencial.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0.0;
        
        System.out.println("Calculadora de Área Residencial");
        
        while (true) {
            System.out.println("\nDigite o nome do cômodo:");
            String nomeComodo = scanner.nextLine();
            
            System.out.println("Digite a largura do cômodo em metros:");
            double largura = scanner.nextDouble();
            
            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = scanner.nextDouble();
            
            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;
            
            System.out.println("Área do " + nomeComodo + ": " + areaComodo + " metros quadrados");
            
            scanner.nextLine(); // Limpar o buffer do scanner
            
            System.out.println("\nDeseja calcular outro cômodo? (SIM/NÃO)");
            String continuar = scanner.nextLine();
            
            if (!continuar.equalsIgnoreCase("SIM")) {
                break;
            }
        }
        
        System.out.println("\nÁrea total da residência: " + areaTotal + " metros quadrados");
        
        scanner.close();
    }
}

