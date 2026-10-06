public class Atividade9 {
    public static void main(String[] args) {
        double[][] solo = {
            {70, 75, 80, 65, 72, 78},
            {60, 68, 70, 64, 66, 72},
            {85, 80, 88, 90, 84, 86},
            {50, 55, 58, 52, 60, 57},
            {72, 74, 76, 70, 78, 75},
            {90, 88, 92, 85, 89, 91}
        };

        for (int i = 0; i < 6; i++) {
            double total = 0;

            for (int j = 0; j < 6; j++)
                total += solo[i][j];

            System.out.println("Média da linha " + (i + 1) + ": " + total / 6);
        }
    }
}