public class Exercicio2 {
    
    // Utilizando (DoWhile),
    // elaborar um programa que apresente o somatório
    // dos valores pares existentes na faixa de 1 até 500.

    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        
        do {
            if (numero % 2 == 0) { // verifica se o número é par
                soma += numero; // adiciona o número par à soma
            }
            numero++;
        } while (numero <= 500);
        
        System.out.println("A soma dos números pares de 1 até 500 é: " + soma);
    }
}

