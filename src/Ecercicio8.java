import java.util.Scanner;

public class Ecercicio8 {
    
    //Elaborar um programa que leia sucessivamente valores numéricos
    //e apresente no final o somatório, a média e o total de valores lidos.
    //O programa deve ler os valores enquanto o usuário estiver fornecendo valores positivos//
    //Ou seja, o programa deve parar quando o usuário fornecer um valor negativo (menor que zero).

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalValores = 0;
        double soma = 0;

        System.out.println("Digite os valores (digite um valor negativo para parar):");

        while (true) {
            double valor = scanner.nextDouble();

            // Verifica se o valor fornecido é negativo
            if (valor < 0) {
                break; // Sai do loop se for negativo
            }

            // Incrementa o total de valores e adiciona o valor à soma
            totalValores++;
            soma += valor;
        }

        // Verifica se foram fornecidos valores positivos antes de calcular a média
        if (totalValores > 0) {
            double media = soma / totalValores;
            System.out.println("Total de valores lidos: " + totalValores);
            System.out.println("Somatório dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi fornecido.");
        }

        scanner.close();
    }
}

