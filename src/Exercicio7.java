public class Exercicio7 {

    //Escrever um programa que calcule e apresente o somatório do número de grãos de trigo
    // que se pode obter em um tabuleiro de xadrez,
    //obedecendo à seguinte regra: colocar um grão de trigo no primeiro quadro,
    //e nos quadros seguintes, o dobro do quadro anterior.
    //Ou seja, no primeiro quadro coloca-se um grão, 
    //no segundo quadro colocam-se dois grãos (neste momento têm-se três grãos),
    //no terceiro quadro colocam-se quatro grãos (tendo neste momento sete grãos),
    //no quarto quadro colocam-se oito grãos (tendo-se, então, 15 grãos), até atingir o sexagésimo quarto.

    public static void main(String[] args) {
        // Inicializa o número de grãos e o somatório
        long totalGraos = 0;
        long graosNoQuadro = 1;

        // Itera sobre os 64 quadros do tabuleiro de xadrez
        for (int i = 1; i <= 64; i++) {
            // Adiciona o número de grãos do quadro atual ao total
            totalGraos += graosNoQuadro;
            
            // Dobra a quantidade de grãos para o próximo quadro
            graosNoQuadro *= 2;
        }

        // Exibe o resultado
        System.out.println("O total de grãos de trigo no tabuleiro de xadrez é: " + totalGraos);
    }
}
    

