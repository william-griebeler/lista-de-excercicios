public class Exercicio6 {
    // Elaborar um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit
    //de dez em dez graus, iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius.
    //O programa deve apresentar os valores das duas temperaturas.
    //Para converter grau Celsius para Fahrenheit, basta multiplicar a temperatura em graus Celsius por 1,8 e somar 32.
    
    public static void main(String[] args) {
        System.out.println("Celsius   |   Fahrenheit");
        System.out.println("--------------------------");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("%5d     |    %8.2f%n", celsius, fahrenheit);
        }
    }
}
