
import java.util.Random;

public class LabirintoDoMinotauro {

    public static char[][] criarLabirinto(int linhas, int colunas, int entradaX, int entradaY, int saidaX, int saidaY) {
        char[][] labirinto = new char[linhas][colunas];
        Random random = new Random();


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                labirinto[i][j] = random.nextBoolean() ? '.' : '#';
            }
        }


        labirinto[entradaX][entradaY] = 'E';
        labirinto[saidaX][saidaY] = 'S';

        return labirinto;
    }

    public static boolean encontrarCaminho(char[][] labirinto, int x, int y) {

        if (labirinto[x][y] == 'S') {
            return true;
        }


        if (labirinto[x][y] == '.' || labirinto[x][y] == 'E') {

            labirinto[x][y] = '*';


            if (x > 0 && encontrarCaminho(labirinto, x - 1, y)) {
                return true;
            }

            if (x < labirinto.length - 1 && encontrarCaminho(labirinto, x + 1, y)) {
                return true;
            }

            if (y > 0 && encontrarCaminho(labirinto, x, y - 1)) {
                return true;
            }

            if (y < labirinto[0].length - 1 && encontrarCaminho(labirinto, x, y + 1)) {
                return true;
            }


            labirinto[x][y] = '.';
        }

        return false;
    }

    public static void imprimirLabirinto(char[][] labirinto) {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                System.out.print(labirinto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
