public class Exercicio1 {


    public static void main(String[] args) {
    
        // Utilizando (While), construir um programa que apresente a soma dos cem 
        // primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).
        
        
       
        int soma = 0;
        int i = 1;
        while (i <= 100) {           
        soma += i;
        i++;
        }
    
        // Exibindo o resultado
        System.out.println("A soma dos cem primeiros números naturais é: " + soma);
    }
    
    }
    
    
