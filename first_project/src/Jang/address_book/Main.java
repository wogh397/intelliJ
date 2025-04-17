package address_book;

import java.util.Scanner;

public class Main {
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
    static Person[] user = new Person[3];

    public static void main(String[] args) {
        user[0] = new Person("daa", "1111", "춘식이", "1111", "1111");
        user[1] = new Person("bbb","bbb","춘삼이","2222","경기도 군포시 개집");
        user[2] = new Person("ccc","ccc","영심이","3333","경기도 안양시 개집");
        user[3] = new Person("ddd","ddd","순심이","4444","경기도 군포시 우리집");
//        user[0][0] = "aaa";
//        user[0][1] = "aaa";
//        user[0][2] = "춘식이";
//        user[0][3] = "서울시 개집";
//        user[0][4] = "1111";
//
//        user[1][0] = "bbb";
//        user[1][1] = "bbb";
//        user[1][2] = "춘삼이";
//        user[1][3] = "경기도 군포시 개집";
//        user[1][4] = "1111";
//
//        user[2][0] = "ccc";
//        user[2][1] = "ccc";
//        user[2][2] = "영심이";
//        user[2][3] = "경기도 안양시 개집";
//        user[2][4] = "1111";
//
//        user[3][0] = "ddd";
//        user[3][1] = "ddd";
//        user[3][2] = "순심이";
//        user[3][3] = "경기도 군포시 우리집";
//        user[3][4] = "1111";

        Scanner input = new Scanner(System.in);

        System.out.println("<<주소록 관리>>");

        while (true) {
            System.out.println("1.로그인");
            System.out.println("2.종료");
            int num = input.nextInt();
            if (num == 2) {
                break;
            }

            System.out.println("ID를 입력하세요. : ");
            String id = input.nextLine();
            System.out.println("PW를 입력하세요. : ");
            String pw = input.nextLine();


            boolean login = false;
            for (int i = 0; i < user.length; i++) {
                if (id.equals(user[i])) {
                    if (pw.equals(user[i])) {
                        System.out.print("로그인 성공");
                        login = true;
                        break;
                    }
                }
            }
            if (!login) {
                continue;
            }

            while (true) {

                boolean logout = false;
                System.out.println("1.주소록 검색");
                System.out.println("2.전체 주소록 검색");
                System.out.println("3.내정보 변경");
                System.out.println("4.로그아웃");
                Scanner scanner = new Scanner(System.in);

                switch (scanner) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }


            }
            //1,주소록검색
            //2.전체 주소록 검색
            //3내정보 변경
            //4.로그아웃

        }
    }
}



