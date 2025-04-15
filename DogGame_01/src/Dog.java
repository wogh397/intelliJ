import java.util.Scanner;

public class Dog { // 강아지 설계도 (틀)

    // 아래처럼 강아지 이름,품종,나이,에너지,행복도 를 저장하는 기능
    String name; // 강아지 이름
    String breed; // 강아지 품종
    int age; // 강아지 나이
    int energy = 50; // 처음엔 에너지 50부터 시작
    int happiness = 50; // 처음엔 행복도 50부터 시작

    Dog(String name, String breed, int age){
        this.name = name; // 내 이름은 ( )
        this.breed = breed; // 내 품종은 ( )
        this.age = age; // 내 나이는 ( )
    }

    void feed(Scanner scanner) {
        System.out.println(name + "에게 밥을 줄까요? (Y/N) : ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println(name + "에게 밥을 줬어요! ");
            System.out.println(name + "배가 고팠는지 숨도 안쉬고 먹는다!!");
            energy += 10;
            happiness += 5;
        } else {
            System.out.println(name + "은 밥을 먹지 않았어요.");
        }
    }
    void play(Scanner scanner) {
        System.out.print(name + "와 놀까요? (Y/N) : ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println(name + "와 놀았습니다!");
            energy -= 10;
            happiness += 15;
        }else {
            System.out.println(name + "은 놀지않았어요.");
        }
    }
    void sleep(Scanner scanner) {
        System.out.print(name + "잠을 재울까요? (Y/N) : ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println(name + "이 잠을 자요...");
            System.out.println(name + "자는 모습이 너무 귀엽다");
            energy += 20;
            happiness -= 5;
        }
    }
    void showStatus(){
        System.out.println("현재 상태:");
        System.out.println("에너지 : " + energy);
        System.out.println("행복도 : " + happiness);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("강아지 이름을 지어주세요 : ");
        String name = scanner.nextLine();

        System.out.print("강아지 품종을 선택하세요 (비숑/골든리트리버/보더콜리/웰시코기/시바/시고르자브종):");
        String breed = scanner.nextLine();

        System.out.print("강아지 나이를 입력하세요 : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Dog myDog = new Dog(name, breed, age);
        System.out.println("\n강아지 " + name + "을 키우기 시작합니다!\n");

        while (true){
            System.out.println("======== 메뉴 =========");
            System.out.println("1. 밥 주기");
            System.out.println("2. 놀아주기");
            System.out.println("3. 잠자기");
            System.out.println("4. 상태보기");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1){
                myDog.feed();
            } else if (choice == 2) {
                myDog.play();
            }else if (choice == 3) {
                myDog.sleep();
            }else if (choice == 4) {
                myDog.showStatus();
            }else if (choice == 5) {
                System.out.println(" 게임을 종료합니다. 잘 키웠어요! ");
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }
            if (myDog.energy > 100) myDog.energy = 100;
            if (myDog.happiness > 100) myDog.happiness = 100;
            if (myDog.energy < 0) myDog.energy = 0;
            if (myDog.happiness < 0) myDog.happiness = 0;

            System.out.println();
        }
            scanner.close();
    }
}
