public class CartItem {
    private Book book;
    private int count;
    private int totalPrice;

    public CartItem(Book book, int count){
        this.book = book;
        this.count = count;
        this.updateTotalPrice();
    }

    public CartItem(Book book){
        this.book = book;
        this.count = 1;
        this.updateTotalPrice();
    }

    public void updateTotalPrice(){
        this.totalPrice = this.book.getPrice()* this.count;
    }

    public Book getBook(){
        return this.book;
    }

    public int getCount(){
        return this.count;
    }

    public int getTotalPrice(){
        return this.totalPrice;
    }

    public void setCount(int count){
        this.count = count;
        this.updateTotalPrice();
    }
}
