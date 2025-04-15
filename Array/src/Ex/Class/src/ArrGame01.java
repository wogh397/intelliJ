import java.util.Scanner;

public class ArrGame01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] baseball = {5, 7, 9};
        int count = 0;
        int strike = 0;
        int ball = 0;
        int out = 0;

    while(true){
        strike = 0;
        ball = 0;
        out = 0;

        int[] arrGame = new int[3];
        System.out.println("숫자 3개를 입력하세요.");

        for(int i = 0; i < arrGame.length; i++) {
            arrGame[i] = scanner.nextInt();
        }

        for(int i = 0; i < arrGame.length; i++){
            for(int j = 0; j < arrGame.length; j++){
            if(baseball[i]==arrGame[j]){
                System.out.print("strike" + " ");
            }else{
                for(int k=0; k<3; k++) {
                    if (j != k && baseball[i] == arrGame[j]) {
                        System.out.print("ball" + " ");
                    }
                }
                }
            }
        }
        count++;
        }
    }
}
