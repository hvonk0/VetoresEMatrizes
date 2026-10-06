public class Atividade3 {
    public static void main(String[] args) {
        double[] consumo = {120, 150, 90, 200, 175, 130, 110, 190, 160, 140, 100, 180};
        int setor = 0;

        for (int i = 1; i < consumo.length; i++)
            if (consumo[i] > consumo[setor]) setor = i;

        System.out.println("Setor que mais consumiu: " + (setor + 1));
        System.out.println("Consumo: " + consumo[setor] + " litros");
    }
}