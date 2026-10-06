public class Atividade4 {
    public static void main(String[] args) {
        double[] producao = {120, 150, 100, 180, 130};
        double total = 0;

        for (int i = 0; i < producao.length; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + producao[i] + " kg");
            total += producao[i];
        }

        System.out.println("Total geral: " + total + " kg");
    }
}