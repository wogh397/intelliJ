public class SmartPhoneMain2 {
    public static void main(String[] args) {
        SmartPhoneImpl2 phone = new SmartPhoneImpl2();

        SmartDevice s = phone; // 상위 타입의 참조변수로 정의
        s.turnOn();
        Phone p = phone; // 상위 타입의 참조변수로 정의
        p.call();
        Application a = phone; // 상위 타입의 참조변수로 정의
        a.appRun();
    }
}
