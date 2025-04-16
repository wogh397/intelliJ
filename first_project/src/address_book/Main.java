package address_book;

import java.util.Scanner;

public class Main {
    static String[][] user = new String[4][5];
    // ======주소록관리======
    // 회원정보 배열로 만들기
    //
    //
    //
    // 1.로그인 -> 1.로그인 출력 - 1 누른경우 - Id,Pw 입력창 - 입력된 ID,Pw 비교 & 찾기
    // true면 로그인 성공 출력 - 틀리면 다시 입력하세요 출력
    // 2.종료
    /**
     * 2차원 배열은 배열안에 배열
     * String[]
     * [] 큰배열안에 두번재 배열이 들어있다.
     *
     * String[][]
     * [][] 작은배열안에
     * 여러종류의 객체가 들어있다.
     *
     * user.length
     * {
     *     {"aaa", "aaa", "춘식이" , "서울시 개집", "1111"},
     *     {},
     *     {},
     *     {}
     * }
     *
     */

    public static void main(String[] args) {
        user[0][0] = "aaa";
        user[0][1] = "aaa";
        user[0][2] = "춘식이";
        user[0][3] = "서울시 개집";
        user[0][4] = "1111";

        user[1][0] = "bbb";
        user[1][1] = "bbb";
        user[1][2] = "춘삼이";
        user[1][3] = "경기도 군포시 개집";
        user[1][4] = "1111";

        user[2][0] = "ccc";
        user[2][1] = "ccc";
        user[2][2] = "영심이";
        user[2][3] = "경기도 안양시 개집";
        user[2][4] = "1111";

        user[3][0] = "ddd";
        user[3][1] = "ddd";
        user[3][2] = "순심이";
        user[3][3] = "경기도 군포시 우리집";
        user[3][4] = "1111";

        Scanner input = new Scanner(System.in);

        System.out.println("<<주소록 관리>>");

        System.out.println("1.로그인");
        int num = input.nextInt();

        while (true) {

            // boolean 로그인 Id,pw 비교 트루일경우 끝
            // 실패false일 경우 반복
            // boolean re = false;

            System.out.println("ID를 입력하세요. : ");
            String id = input.nextLine();

            System.out.println("PW를 입력하세요. : ");
            String pw = input.nextLine();

            for(int i = 0; i < user.length; i++){
                String ids = user[i][0]; // String[] 큰배열안에 String[][] 작은배열안에 ID
                String pw = user[i][1]; // String[] 큰배열안에 String[][] 작은배열안에  PW

                // equals 란 ? id를 같은지 비교 후 true 또는 false 반환
                // 아래인 && 사용한경우 한번에 비교 가능
                if(ids.equals(user[i][0]) && pw.equals(user[i][1])) {
                        System.out.print("로그인 성공");
                        break;
                    }

                }

            }

        }

    }

