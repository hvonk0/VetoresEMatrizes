public class Atividade8 {
    public static void main(String[] args) {
        int[][] pragas = {
            {2, 4, 1, 3, 5},
            {6, 2, 8, 1, 4},
            {3, 7, 2, 9, 1},
            {5, 4, 6, 2, 3},
            {1, 3, 4, 5, 7}
        };

        int linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (pragas[i][j] > pragas[linhaMaior][colunaMaior]) {
                    linhaMaior = i;
                    colunaMaior = j;
                }

        System.out.println("Região: linha " + (linhaMaior + 1) +
                           ", coluna " + (colunaMaior + 1));
        System.out.println("Focos: " + pragas[linhaMaior][colunaMaior]);
    }
}