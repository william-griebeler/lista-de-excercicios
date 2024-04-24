public class Exercicio5 {


    // Escrever um programa que apresente os valores da sequência numérica de Fibonacci até o décimo quinto termo.
    // A sequência de Fibonacci é formada pelos valores numéricos
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ... etc.
    // obtendo-se o próximo termo a partir da soma do termo atual com
    // o anterior sucessivamente até o infinito se a sequência não for interrompida,
    //sendo determinada a partir da fórmula fórmula Fn = Fn-1 + Fn-2.
    //Utilize para este exercício as variáveis ATUAL, ANTERIOR e PRÓXIMO. 


    public static void main(String[] args) {
        
        int ATUAL = 1;
        int ANTERIOR = 0;
        int PROXIMO;

        System.out.println("Os primeiros 15 termos da sequência de Fibonacci:");

        for (int i = 0; i < 15; i++) {
            if (i <= 1) {
                PROXIMO = i;
            } else {
                PROXIMO = ATUAL + ANTERIOR;
                ANTERIOR = ATUAL;
                ATUAL = PROXIMO;
            }
            System.out.print(PROXIMO + ", ");
        }
    }
}

