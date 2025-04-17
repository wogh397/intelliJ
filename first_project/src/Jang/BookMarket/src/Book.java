public class Book {
    private String id;
    private String tittle;
        int price;
    private String author;
    private String subheading;
    private String booktype;
    private String day;

        public Book(String ids, String tittles,int prices, String authors, String subheadings, String bookTypes, String days){
                this.id = ids;
                this.tittle = tittles;
                this.price = prices;
                this.author = authors;
                this.subheading = subheadings;
                this.booktype = bookTypes;
                this.day = days;
            }

        public String getId() { return this.id; }

        public String getTittle() { return tittle; }

        public int getPrice() { return price; }

        public String getAuthor() { return author; }

        public String getSubheading() { return subheading; }

        public String getBookType() { return booktype; }

        public String getDay() { return day; }
}

