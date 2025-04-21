public class AbstractClass01 {
    public static void main(String[] atgs) {
        Shape s1 = new Circle("빨간색", 2.2);
        Shape s2 = new Rectangle("노랜색",2,4);


        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
