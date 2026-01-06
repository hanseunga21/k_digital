package a0106;

public class String2 {
    public static void main(String[] args) {
        String fristName = "홍";
        String lastName =  "길동";
        String fullName = fristName + " " + lastName; // "홍 길동"
        System.out.println(fullName);

        //+= 연산자
        String message = "Hello";
        message += " World"; // Hello world
        System.out.println(message);

        //concat() 메소드
        String str = "Hello";
        str = str.concat("World");
        System.out.println(str);

        //길이와 빈 문자열 확인
        String str1 = "Hello";
        //length
        int len = str1.length();
        System.out.println("문자열 길이 : " + len);
        //isEmpty() :  빈 문자열
        boolean empty = str1.isEmpty(); //flase 비여있는지 물어봄
        String emptystr = "";
        boolean isEmp = emptyStr.isEmpty(); //true
        System.out.println("비여있니? " isEmp);
    }
}
