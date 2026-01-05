package a0105;

public class Arrary5 {
    public static void main(String[] args) {
        //배열 {70,85,90,60,75}
        //평균을 구하고
        //평균점수 이상인 점수만 구하시오
        int[] score  = {70,85,90,60,75};
        int sum = 0;
        for(int i=0; i< score.length; i++){
            sum += score[i];
        }
        double avg = (double)sum / score.length;
        System.out.println("평균 : " + avg);
        System.out.println("평균 이상인 점수들 : ");
        for(int i=0; i< score.length; i++){
            if(score[i] >= avg){
                System.out.println(score[i]);
            }
        
        }  
    }
}
