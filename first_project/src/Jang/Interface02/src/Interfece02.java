import java.util.Scanner;

public class Interfece02 {
    public static void main(String[] args) {
        System.out.println("동물선택: 닭(1), 새(1)");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
            case 1:
                Interfece02.animalFly(new Chicken());
                Interfece02.animalWalk(new Chicken());
                break;

            case 2:
                Interfece02.animalFly(new Bird());
                Interfece02.animalWalk(new Bird());
                break;
        }
        public static void animalFly(Fly animal){
            animal.fly();
        }
        public static void animalWalk(Walk animal) {
            animal.walk();
        }

}}



