import java.util.Scanner;

public class BaseBallRandom01 {
    public static void main(String[] args) {
        int[] correct = new int[3];
        int[] answer = new int[3];
        Scanner input = new Scanner(System.in);
        int count = 0;

        while(true){
            boolean flag = false;
            int num = (int)(Math.random()*9) +1;
            for(int i=0; i< correct.length; i++){
                if(correct[i] == num){
                    flag = true;
                    break;

                }
            }
            if(flag){
                continue;
            }
            correct[count++] = num;
            if(count == 3){
                break;
            }
        }
        System.out.println(correct[0] + " " + correct[1] + " " + correct[2]);
    }
}
