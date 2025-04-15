package Class;

public class Cat {
    String breed;
    String color;

    Cat(){
        System.out.println("Cat() 생성자 호출합니다.");
    }
    Cat(String pBreed){
        System.out.println("Cat(...) 생선자 호출합니다.");
        this.breed = pBreed;
    }

    void eat(){
        System.out.println("먹이를 먹다.");
    }
    void scratch(){
        System.out.println("발톱을 할퀴다.");
    }
    void meow(){
        System.out.println("야옹하고 울다.");
    }
}
