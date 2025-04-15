import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세욧!!!");
        double num1 = scanner.nextDouble();

        System.out.print("연산자 입력 (+, -, *, /): ");
//        scanner.next() <-- 는 문자열(String)을 리턴함
//        scanner.next() <-- .next() 만 쓰는이유 : 한 단어를 입력받는 메서드
//        계산기에서 사용하려하기 때무에 문자열만 받고
//
        char operator = scanner.next().charAt(0)


    }
}