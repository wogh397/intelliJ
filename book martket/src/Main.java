
//import java.awt.*;

import java.util.Scanner;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.detail;
//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;
//
//public class Main {
//    public static void main(String[] args) {
//
//        public class MenuItem {
//            String id;
//            String title;
//            String detail;
//            boolean active;
//
//        public MenuItem(String id, String title, String detail, boolean active){
//            this.id = id;
//            this.title = title;
//            this.detail = detail;
//            this.active = active;}
//        }
//
//        public void show() {
//            System.out.println(id + " " + title);
//            if (active) {
//                System.out.println("→ 설명: " + detail);
//            }
//        }
//    }
//public class Main {
//    public static void main(String[] args) {
//        MenuItem[] menuItems = {
//                new MenuItem("1.", "고객 정보 확인하기", "고객의 이름, 전화번호, 주소 등을 확인합니다.", false),
//                new MenuItem("2.", "장바구니 상품 목록 보기", "현재 장바구니에 담긴 상품들을 보여줍니다.", false),
//                new MenuItem("3.", "장바구니 비우기", "장바구니의 모든 상품을 제거합니다.", false),
//                new MenuItem("4.", "바구니에 항목 추가하기", "상품을 장바구니에 추가합니다.", false),
//                new MenuItem("5.", "장바구니의 항목 수량 줄이기", "선택한 상품의 수량을 줄입니다.", false),
//                new MenuItem("6.", "장바구니의 항목 삭제하기", "특정 상품을 장바구니에서 제거합니다.", false),
//                new MenuItem("7.", "영수증 표시하기", "총 결제 금액과 항목 목록을 출력합니다.", false),
//                new MenuItem("8.", "종료", "프로그램을 종료합니다.", false)
//        };
//
//        for (menuItems item : menuItems) {
//            item.show();
//            System.out.println();
//        }
//    }
//}
public class Main{
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
                String Name4 = "4. 바구니에 항목 추가하기";
                String Name5 = "5. 장바구니의 항목 수량 줄이기";
                String Name6 = "6. 장바구니의 항목 삭제하기";
                String Name7 = "7. 영수증 표시하기";
                String Name8 = "8. 종료";

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




//        System.out.println("1. 고객 정보 확인하기 \t 4.바구니에 항목 추가하기");
//        System.out.println("2. 장바구니 상품 목록 보기 \t 5. 장바구니의 항목 수량 줄이기");
//        System.out.println("3. 장바구니 비우기 \t 6. 장바구니의 항목 삭제하기");
//        System.out.println("7. 영수증 표시하기 \t 8.종료");
    }
}

