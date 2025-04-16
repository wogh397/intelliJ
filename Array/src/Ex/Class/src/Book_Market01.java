import Ex.Class.src.CartItem;
import Ex.Class.src.Parson;

import java.util.Scanner;

public class Book_Market01 {
    public static class Main {

            static String[][] mBook = new String[3][7];

            static CartItem[] mcart = new CartItem[3];

            static int mCarItemCount = 0;

            public  static  void main(String[] args){
                mBook[0][0] = "ISBN1234";
                mBook[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
                mBook[0][2] = "27000";
                mBook[0][3] = "송미영";
                mBook[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
                mBook[0][5] = "IT전문서";
                mBook[0][6] = "2018/10/08";

                mBook[1][0] = "ISBN1235";
                mBook[1][1] = "안드로이드 프로그래밍";
                mBook[1][2] = "33000";
                mBook[1][3] = "우재남";
                mBook[1][4] = "실습 단계별 명쾌한 멘토링!";
                mBook[1][5] = "IT전문서";
                mBook[1][6] = "2022/01/22";

                mBook[2][0] = "ISBN1236";
                mBook[2][1] = "스크래치";
                mBook[2][2] = "22000";
                mBook[2][3] = "고광일";
                mBook[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
                mBook[2][5] = "컴퓨터입문";
                mBook[2][6] = "2019/06/10";
                }


        public static void menuGuestInfo(Parson user){
            System.out.println("고객 정보 확인하기");
            System.out.println("현재 고객 정보 :\n" + "이름 :\t" + user.getname() + "\t" + "연락처 :\t" + user.getPhone());
        }
        public static void menuCartItemList(){
            System.out.println("장바구니 상품 목록 보기");
        }
        public static void menuCartClear(){
            System.out.println("장바구니 비우기");
        }
        public static void menuCartAddItem(){


            //for 반복
            // i열[0][0]부터 mBook.length(mBook) 길이만큼 증가
            for(int i = 0; i < mBook.length; i++){
                if(Bookid.equals(mBook[i][0]))
            }

                // i열안에 j열[0][0]부터 mBook 길이만큼 증가
                for(int j = 0; j <mBook[i].length; j++){

                    //mbook i열,j열 + "문자열 |" 출력하고 out!
                    System.out.print(mBook[i][j] + " | ");
                }
                // j열안에 있는 내용 출력불러오고 out!
                System.out.println();
            }

            //"문자열" 출력후 out!
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            //
            Scanner scanner = new Scanner(System.in);

            String inputId = scanner.nextLine();

            System.out.println(inputId);

        if (index != -1) {
            System.out.println("장바구니에 추가하겠습니까? Y | N ");
            String yn = input.nextLine();

            if (yn.toUpperCase().equals("Y")) {
                if (!isCartInbook(bookid)) {

                     mcart[mCarItemCount] = new CartItem(mBook[index]);

                    mCarItemCount ++;
                }
                System.out.println(mBook[index][1] + "가 장바구니에 추가되었습니다.");
            }
            exit = true;
        }else {
            System.out.println(inputId + "도서가 장바구니에 추가되었습니다.");
        }
        public static void menuCartRemoveItemCount(){
            System.out.println("장바구니의 항목 수량 줄이기");
        }
        public static void menuCartRemoveItem(){
            System.out.println("장바구니의 항목 삭제하기");
        }
        public static void menuCartBill(){
            System.out.println("영수증 표시하기");
        }
        public static boolean isCartInbook(String bookId){

            for(int i=0; i<mCarItemCount; i++){ // new 로 만들어진 객체만 this로 불러옴

                if(bookId.equals((mcart[i].getbook()[0])){ //

                    mcart[i].setCount(mcart[i].getCount() + 1 ); //

                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            // 선택목록 문자열로 저장하기
            String str1 = "고객 정보 확인하기";
            String str2 = "장바구니 상품 목록 보기";
            String str3 = "장바구니 비우기";
            String str4 = "장바구니에 항목 추가하기";
            String str5 = "장바구니의 항목 수량 줄이기";
            String str6 = "장바구니의 항목 삭제하기";
            String str7 = "영수증 표시하기";
            String str8 = "종료";

            // mBook 정보



            // 스캐너 생성
            Scanner input = new Scanner(System.in);


            // 이름과 연락처 순서대로 입력 menuGuestInfo (String x ,String y) x = name y = phone
            System.out.print("당신의 이름을 입력하세요 : \t");
            String name = input.nextLine(); // 내용입력 후 엔터
            System.out.print("연락처를 입력하세요 : \t");
            String phone = input.nextLine(); // 내용입력 후 엔터

            Parson user = new Parson(name, phone);

            while (true) {
                System.out.println("=======================================================================");
                System.out.println("\t\t\twelcome to Shopping Mall");
                System.out.println("\t\t\twelcome to Book Market");
                System.out.println("=======================================================================");

                System.out.print("1.\t" + str1 + "\t\t\t" + "4.\t" + str4 + "\n");
                System.out.print("2.\t" + str2 + "\t\t" + "5.\t" + str5 + "\n");
                System.out.print("3.\t" + str3 + "\t\t\t" + "6.\t" + str6 + "\n");
                System.out.print("7.\t" + str7 + "\t\t\t" + "8.\t" + str8 + "\n");
                System.out.println("=======================================================================");

                // 메뉴 번호 선택 출력
                System.out.print("메뉴 번호를 선택해주세요\t");
                int number = input.nextInt(); // 스캐너 nextInt 저장 selectNumber 에 대입
                System.out.println(number + "번을 선택했습니다"); // 내용 출력
                input.nextLine();  // ← 줄바꿈(엔터) 제거용 ✅ 이유: nextInt()는 줄바꿈(Enter)을 소비하지 않음

                switch (number) { // 번호 선택 항목 선택별 케이스 출력
                    case 1:
                        menuGuestInfo(user);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem();
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCartBill();
                        break;
                    case 8:
                        System.out.println("종료합니다.");
                        break;
                    default:
                        System.out.println("잘못 입력된 번호 입니다.");

                }

                if(number == 8)break; // 8이라면 break 걸어서 while 문 종료 // 8번 케이스 이외 whlie로 감싸져있는 항목 다시 반복

            }
        }
    }
}
