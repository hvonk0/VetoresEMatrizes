public class Atividade6 {
    public static void main(String[] args) {
        double[][] producao = {
            {10, 20, 30},
            {15, 25, 35},
            {12, 22, 32},
            {18, 28, 38}
        };

        for (int cultura = 0; cultura < 3; cultura++) {
            double total = 0;

            for (int mes = 0; mes < 4; mes++)
                total += producao[mes][cultura];

            System.out.println("Cultura " + (cultura + 1) + ": " + total);
        }
    }
}