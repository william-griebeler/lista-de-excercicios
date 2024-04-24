import java.util.Scanner;

public class Ecercicio9 {
    

    //Elaborar um programa que leia valores positivos inteiros até que um valor negativo seja informado.
    // Ao final devem ser apresentados o maior e o menor valores informados pelo usuário



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE; // Inicializando o maior com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializando o menor com o maior valor possível
        
        System.out.println("Digite valores positivos inteiros (digite um número negativo para encerrar):");
        
        while (true) {
            int valor = scanner.nextInt();
            
            if (valor < 0) {
                break; // Se o valor for negativo, sai do loop
            }
            
            // Atualiza o maior valor, se necessário
            if (valor > maior) {
                maior = valor;
            }
            
            // Atualiza o menor valor, se necessário
            if (valor < menor) {
                menor = valor;
            }
        }
        
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor foi informado.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
        
        scanner.close();
    }
}

