public class Atividade5 {
    public static void main(String[] args) {
        double[] umidade = {35, 42, 38, 50, 29, 45, 33, 41};
        int quantidade = 0;

        for (double valor : umidade)
            if (valor < 40) quantidade++;

        System.out.println("Áreas abaixo de 40%: " + quantidade);
    }
}