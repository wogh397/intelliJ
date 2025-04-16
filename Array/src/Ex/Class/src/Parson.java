package Ex.Class.src;

public class Parson {
    private String name;
    private String phone;

    public Parson(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    // private를 읽어오는 생성자는 public 이다.
    // 아래와 같이 public=읽기접근자 / String
    public String getname(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
