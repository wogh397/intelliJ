import java.util.Scanner;

public class Book_Market {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("당신의 이름을 입력하세요.");
                String name = input.nextLine();
//                System.out.println("당신의 이름 : " + name);

                System.out.print("연락처를 입력하세요.");
                String number = input.nextLine();
//                System.out.println("당신의 연락처 : " + number);


                String Name1 = "1. 고객 정보 확인하기";
                String Name2 = "2. 장바구니 상품 목록 보기";
                String Name3 = "3. 장바구니 비우기";
                String Name4 = "4. 장바구니에 항목 추가하기";
                String Name5 = "5. 장바구니의 항목 수량 줄이기";
                String Name6 = "6. 장바구니의 항목 삭제하기";
                String Name7 = "7. 영수증 표시하기";
                String Name8 = "8. 종료";

                // 배열을 만들어 도서목록 저장 String list1 = "책이름";
                String[][] mBook1 = new String[3][7];
                mBook1[0][0] = "ISBN1234";
                mBook1[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
                mBook1[0][2] = "27000";
                mBook1[0][3] = "송미영";
                mBook1[0][4] = "단계별 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
                mBook1[0][5] = "IT전문서";
                mBook1[0][6] = "2018/10/08";

//                String[][] mBook2 = new String[3][7];
//                mBook2[1][0] = "ISBN1235";
//                mBook2[1][1] = "안드로이드 프로그래밍";
//                mBook2[1][2] = "33000";
//                mBook2[1][3] = "우재남";
//                mBook2[1][4] = "실습 단계별 명쾌한 멘토링!";
//                mBook2[1][5] = "IT전문서";
//                mBook2[1][6] = "2022/01/22";
//                mBook2[1][7] = " ";
//
//                String[][] mBook3 = new String[3][7];
//                mBook3[2][0] = "ISBN1236";
//                mBook3[2][1] = "스크래치";
//                mBook3[2][2] = "22000";
//                mBook3[2][3] = "고광일";
//                mBook3[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
//                mBook3[2][5] = "컴퓨터입문";
//                mBook3[2][6] = "2019/06/10";
//                mBook3[2][7] = " ";






                //
                // Name4 번을 누르면 배열안에 목록들 불러오기
                // 불러온 도서목록 노출
                // 추가 빈배열을 만들기
                // 선택된 도서목록 장바구니(빈배열)에 추가
                // 장바구니 삭제 및 비우기
                // 주문 처리 계산


                System.out.print("*".repeat (50) + "\n");
                System.out.println("Welcome to Shopping mall");
                System.out.println("Welcome to Book Market");
                System.out.print("*".repeat (50) + "\n");
                System.out.println(Name1 + " \t\t " + Name4);
                System.out.println(Name2 + " \t " + Name5);
                System.out.println(Name3 + " \t\t " + Name6);
                System.out.println(Name7 + " \t\t " + Name8);
                System.out.print("*".repeat (50) + "\n");

                System.out.print("메뉴 번호를 선택해주세요");
                String num = input.nextLine();
                System.out.println(num + "번을 선택했습니다.");
    }
}
