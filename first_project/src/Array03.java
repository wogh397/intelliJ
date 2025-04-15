import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
//                                 [학생수],
        double[][] marks = new double[3][4];
        Scanner s =new Scanner(System.in);


        for ( int i = 0; i < 5; i++){
            System.out.println("학생번호" + (i + 1));
            System.out.print("국어점수 : ");
            marks[i][0] = s.nextDouble();

            System.out.print("수학점수 : ");
            marks[i][1] = s.nextDouble();

            System.out.print("과학점수 : ");
            marks[i][2] = s.nextDouble();

            System.out.print("사회점수 : ");
            marks[i][3] = s.nextDouble();
            marks[i][4] = (marks[i][0] + marks[i][4])/2;

        }
        for (int i =0; i < 2; i++){
            System.out.println("학생번호" + (i+1));
            System.out.print("국어" + ":" + marks[i][0] + " ");
            System.out.print("수학" + ":" + marks[i][1] + " ");
            System.out.println("과학" + ":" + marks[i][2] + " ");
            System.out.println("사회" + ":" + marks[i][3] + " ");
            System.out.println("평균" + ":" + marks[i][4] + " ");

        }
    }
}
