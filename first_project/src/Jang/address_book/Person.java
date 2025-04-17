package address_book;

public class Person{
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;

    public Person(String id, String pw, String name, String phone, String address){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    public String getId() { return this.id; }
    // id,pw,name 은 변경이 없으니 읽기생성자 void,set 은 밑에 처럼 만들 필요가없다

    public String getPw() { return this.pw; } //

    public String getName() { return this.name; } //

    public String getPhone() { return this.phone; } //

    public String getAddress() { return this.address; } //

    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }

}
