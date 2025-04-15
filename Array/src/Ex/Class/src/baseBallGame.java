import java.util.Random;
import java.util.Scanner;

public class baseBallGame {
    public static void main(String[] args) {

//      랜덤 숫자 뽑기
        int[] baseBall = new int[3];
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("정답");

        // 0~9까지 랜덤으로 정수로 배열에 넣는다
        for(int i=0; i< baseBall.length; i++){
            baseBall[i] = (int)(Math.random()*10);
        }

        // 사용자가 입력한 시도횟수
        int answerCount = 0;

        while(true){

            // 사용자 입력값 저장 배열
            int[] answer = new int[3];
            // 스크라이크 갯수 저장변수
            int strike = 0;
            // 볼 갯수 저장변수
            int ball  = 0;

            System.out.println("정답시도");

            //사용자 입력값 저장
            for(int i=0; i< answer.length; i++){
                answer[i] = input.nextInt();
            }
            // 시도횟수 증가
            answerCount++;
            //
            boolean flag = false;

            for(int i=0; i < answer.length; i++){
                for(int j=0; j< answer.length; j++){
                    if(baseBall[i] == answer[j]){
                      if(i==j){
                          strike++;
                      }else{
                          ball++;
                      }
                      break;
                    }
                }
            }
            if(!flag){
                System.out.println("Out");
            }else{
                System.out.println("Strike : " + strike + " Ball : " + ball);
            }
            if(strike == 3){
                break;
            }
        }
        System.out.println(answerCount + " 번 만에 정답을 맞췄습니다.");

    }
}
