package Ex.Class.src;

public class CartItem { // 카트아이템경우 여러가지 객체 만들수있음
    private String[] book; //
    private int count; // 수량을 담기위해 int
    private int totalPrice; // 가격 표시위해 int

    public CartItem(String[] book, int count){
        this.book = book;
        this.count = count;
        this.updateTotalPrice();
    }

    public CartItem(String[] book){
        this.book = book;
        this.count = 1;
        this.updateTotalPrice();
        //
    }

    public void updateTotalPrice(){
        this.totalPrice = Integer.parseInt(this.book[2])* this.count;
    }
    public String[] getbook(){
        return this.book;
    }

    public int getCount(){
        return this.count();
    }
    public int getTotalPrice(){
        return this.totalPrice;
    }

    public void serCount(int count){
        this.count = count;
        this.updateTotalPrice();
    }
}


