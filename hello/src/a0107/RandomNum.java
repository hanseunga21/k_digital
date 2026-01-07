package a0107;

public class RandomNum {
    public static void main(String[] args) {
        int n = rollDie();
        System.out.printf("주사위의 눈: %d", n);
    }

    private static int rollDie() {
        double x = 6 * Math.random();
        int temp = (int) x; // 형변환 (다운 캐스팅) -> 소수점 제거  ,  temp: 임시변수
        return temp + 1;
    }
}
