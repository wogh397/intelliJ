import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
//             배열선언    =     배열생성 int는 정수
//1차원 배열   int[] myArr = new int[5];
        Scanner s1 = new Scanner(System.in);

        int[][] myArr = new int [4][4];

//           괄호안에 int(숫자)를 받아야 해서 int 적어줌
        for (int i = 0; i < 3; i++) { // 행숫자 0부터 받아서 3행까지
            for (int j = 0; j < 3; j++) { // 열숫자 0부터 받아서 3열까지
                System.out.println("숫자를 입력하세요");
//              myArr 이라는 변수명 선언
                myArr[i][j] = s1.nextInt(); // i,j 값이 들어감
            }
            System.out.println();
        } //
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                myArr[i][3] += myArr[i][j];
                myArr[3][j] += myArr[i][j];
                myArr[3][3] += myArr[i][j];
                System.out.println();
        }
    }
        // 행,열 for
        for(int i = 0; i < 3; i++){
            System.out.print(i + "행합계:" + myArr[i][3]);
        }
            System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print(i + "열합계:" + myArr[3][i]);
        }
            System.out.println();
            System.out.println("총 합계:" + myArr[3][3]);
        }
    }

