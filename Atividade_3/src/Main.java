

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //O Minotauro aprisionou Teseu em um labirinto infinito. O labirinto é representado por uma matriz bidimensional,
        //onde cada célula pode ser um caminho livre (`.`) ou uma parede (`#`). Teseu está na entrada do labirinto (célula
        //inicial) e precisa encontrar a saída (célula final).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas do labirinto: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas do labirinto: ");
        int colunas = scanner.nextInt();

        int entradaX = 0, entradaY = 0;
        int saidaX = linhas - 1, saidaY = colunas - 1;

        char[][] labirinto = LabirintoDoMinotauro.criarLabirinto(linhas, colunas, entradaX, entradaY, saidaX, saidaY);

        if (LabirintoDoMinotauro.encontrarCaminho(labirinto, entradaX, entradaY)) {
            LabirintoDoMinotauro.imprimirLabirinto(labirinto);
        } else {
            System.out.println("Labirinto sem saída.");
        }

        scanner.close();
    }
}


