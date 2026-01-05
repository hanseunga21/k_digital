package a0105;

import javax.sound.sampled.SourceDataLine;

public class Arrary1 {
    public static void main(String[] args) {
        //방법1 선언 후 
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers[3]);

        //방법2 선언과 동시에 초기화
        int[] nums = {10,20,30,40,50};
        //또는
        //int[] nums1 = new int[]{10,20,30,40,50};
        System.out.println(nums[0]);
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
            //nums [ 0]=1
            //nums [ 1]=2
            //nums [ 2]=3
            //nums [ 3]=4
            //nums [ 4]=5
        }
}
}