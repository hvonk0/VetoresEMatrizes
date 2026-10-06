public class Atividade2 {
    public static void main(String[] args) {
        double[] temperaturas = {28, 31, 29, 35, 32, 27, 30, 33, 26, 34};
        int quantidade = 0;

        for (double temperatura : temperaturas)
            if (temperatura > 30) quantidade++;

        System.out.println("Dias acima de 30°C: " + quantidade);
    }
}