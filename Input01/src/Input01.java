import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("정수값 입력하기");
        int n = s1.nextInt();

        System.out.println("실수값 입력하기");
        double db =s1.nextDouble();
        System.out.println("정수값 : " + n);
        System.out.println("실수값 : " + db);
    }

}