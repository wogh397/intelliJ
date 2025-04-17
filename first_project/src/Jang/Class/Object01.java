package Class;

public class Object01 {
    public static void main(String[] args) {
        // Student 클래스의 생성자 호출해서 반환되는 객체를 stObj1에 저장
        Student stObj1 = new Student();

        // 반환되는 인스턴스 stObj1의 멤버 변수 id를 직접 변경
        stObj1.id = 20221004;
        // 반환되는 인스턴스 stObj1의 멤버 변수 name를 직접 변경
        stObj1.name = "홍길순";
        // 반환되는 인스턴스 stObj1 id,name 출력
        stObj1.printInfo();

        // Student 클래스의 생성자 호출해서 반환되는 객체를 stObj2에 저장
        Student stObj2 = new Student();
        //
        stObj2.insertRecord(20021005, "홍길동");

        stObj2.printInfo();



    }
}
