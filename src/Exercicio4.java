public class Exercicio4 { 

    // Elaborar um programa que apresente os resultados das potências do valor de base 3,
    // elevado a um expoente que varia do valor 0 até o valor 15.
    // O programa deve apresentar os valores 1, 3, 9. 27, ..., 14.348.907.Sugestão:
    // leve em consideração as definições matemáticas do cálculo de potência,
    // em que qualquer valor numérico diferente de zero elevado a zero é 1,
    //e todo valor numérico elevado a 1 é ele próprio.
    // Não use o operador aritmético de exponenciação “Math.pow” e
    // resolva o problema com a técnica de laço a sua escolha

    
    public static void main(String[] args) {
        int base = 3;
        
        // Calculando e exibindo as potências de 3 de 0 a 15
        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = calcularPotencia(base, expoente);
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }
    
    // Função para calcular a potência sem usar Math.pow
    public static long calcularPotencia(int base, int expoente) {
        // Se o expoente for 0, o resultado é sempre 1
        if (expoente == 0) {
            return 1;
        }
        
        // Inicializando o resultado com a base
        long resultado = base;
        
        // Multiplicando a base pelo número de vezes do expoente
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        
        return resultado;
    }
}




