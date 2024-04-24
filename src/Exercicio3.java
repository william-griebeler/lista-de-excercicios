public class Exercicio3 {
    
    //Utilizando (While), construir um programa que apresente todos os valores numéricos divisíveis por 4
    // e menores que 200.Sugestão: a variável que controla o contador do laço deve ser iniciada com valor 1.

    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Valores divisíveis por 4 e menores que 200:");

        while (contador < 200) {
            if (contador % 4 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}

