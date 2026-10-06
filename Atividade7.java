public class Atividade7 {
    public static void main(String[] args) {
        double[][] chuva = {
            {10, 12, 8, 15},
            {5, 7, 9, 11},
            {20, 18, 16, 14},
            {12, 10, 13, 9},
            {8, 6, 7, 5},
            {15, 17, 14, 16},
            {9, 11, 10, 12}
        };

        for (int area = 0; area < 4; area++) {
            double total = 0;

            for (int dia = 0; dia < 7; dia++)
                total += chuva[dia][area];

            System.out.println("Área " + (area + 1) + ": " + total + " mm");
        }
    }
}