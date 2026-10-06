public class Atividade10 { 
    public static void main(String[] args) { 
        double[][] pomares = { 
            {10, 12, 15, 13, 14, 16, 18, 17, 15, 14, 13, 12}, 
            {20, 18, 22, 21, 19, 23, 25, 24, 22, 21, 20, 19}, 
            {15, 16, 14, 18, 17, 19, 20, 21, 18, 17, 16, 15}, 
            {25, 24, 26, 23, 27, 28, 30, 29, 26, 25, 24, 23} 
        }; 
        
        int maiorPomar = 0; 
        double maiorTotal = 0; 
        
        for (int i = 0; i < 4; i++) { 
            double total = 0; 
            for (int j = 0; j < 12; j++) {
                total += pomares[i][j]; 
            }
            System.out.println("Pomar " + (i + 1) + ": " + total); 
            
            if (total > maiorTotal) { 
                maiorTotal = total; 
                maiorPomar = i; 
            } 
        } 
        
        System.out.println("Maior produção: Pomar " + (maiorPomar + 1)); 
        System.out.println("Produção anual: " + maiorTotal); 
    } 
}
