public class Atividade1 {
    public static void main(String[] args) {
        double[] milho = {10, 12, 8, 15, 11, 14, 9};
        double total = 0, maior = milho[0];

        for (double valor : milho) {
            total += valor;
            if (valor > maior) maior = valor;
        }

        System.out.println("Total: " + total + " toneladas");
        System.out.println("Média: " + total / milho.length);
        System.out.println("Maior produção: " + maior);
    }
}