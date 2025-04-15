import java.util.Random;
import java.util.Scanner;

public class BaseBallRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int[] answer = new int[3];
        for (int i = 0; i < 3; ) {
            int num = random.nextInt(9) + 1;
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (answer[j] == num) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                answer[i] = num;
                i++;
            }
        }

        boolean correct = false;
        while (!correct) {
            System.out.print("숫자 3개를 입력하세요 (1~9): ");
            int[] input = new int[3];
            for (int i = 0; i < 3; i++) {
                input[i] = scanner.nextInt();
            }

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 3; i++) {
                if (input[i] == answer[i]) {
                    strike++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        if (i != j && input[i] == answer[j]) {
                            ball++;
                        }
                    }
                }
            }

            System.out.println(" " + strike + " 스트라이크, " + ball + " 볼");

            if (strike == 3) {
                correct = true;
                System.out.println("정답입니다! 게임 종료!");
            }
        }

        scanner.close();
    }
}
