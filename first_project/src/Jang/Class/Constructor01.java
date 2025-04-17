package Class;

public class Constructor01 {
    public static void main(String[] args){
        System.out.println("****학생 주소록****");
        Student stObj = new Student();

        stObj.insertRecord(20221004, "홍길순");
        stObj.printInfo();
    }
}
