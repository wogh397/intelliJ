import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int answer = random.nextInt(100) + 1;
            int guess = 0;
            int tries = 0;

            System.out.println("=== 숫자 맞추기 게임 ===");
            System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");
            while (guess != answer) {
                System.out.println("숫자 입력 : ");
                guess = scanner.nextInt();
                tries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("⚠\uFE0F 1~100 사이의 숫자만 입력하세요!");
                } else if (guess < answer) {
                    System.out.println("\uD83D\uDCC9 너무 작아요!");
                } else if (guess > answer) {
                    System.out.println("\uD83D\uDCC8 너무 커요!");
                } else {
                    System.out.println("\uD83C\uDF89 정답입니다! " + tries + "번 만에 맞췄어요!");
                }
            }
            System.out.println("다시 하시겠습니까? (y/n): ");
            String again = scanner.next();

            if (!again.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("게임을 종료합니다. 감사합니다!");
            }
        }
        scanner.close();
    }
}
