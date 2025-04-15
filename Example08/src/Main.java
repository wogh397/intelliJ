import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("너의 이름을 입력하세요");
        String name = input.nextLine();
        System.out.println("너의 이름은 : " + name);
    }
}