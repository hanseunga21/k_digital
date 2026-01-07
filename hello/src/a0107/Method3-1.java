package a0107;

public class Method3_1 {
    public static void main(String[] args) {
        NamePrinter.printName("홍길동");
        //매개 변수가 있으나 return 필요 없음
    }

    }
class NamePrinter{
    static void printName(String name) {
        System.out.println("이름:" + name);


}
}
