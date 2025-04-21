public class Item {
    String itemId;
    String name;
    int price;


    public Item(int price, String itemId, String name) {
        this.price = price;
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
