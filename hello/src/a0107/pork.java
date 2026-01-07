package a0107;

public class pork {
    public static void main(String[] args) {
        int n = 3;
        double x = calc(n);
        
        System.out.printf("삼겹살 %d 인분의 칼로리: %.2f Kcal" ,n ,x);


    }

    private static double calc(int n) {
        int totalGram = n * 180; //1인분당 180g
        double totalKcal = totalGram * 5.179; // 1g당 5.179 kcal
        return totalKcal;

   
}
}
