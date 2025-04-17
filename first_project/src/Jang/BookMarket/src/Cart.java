public class Cart {
    private CartItem[] mCart = new CartItem[3];
    private  int mCartItemCount = 0;

    public boolean isCartInBook(String bookId) {
        for (int i = 0; i < mCartItemCount; i++) {
            if (bookId.equals(this.mCart[i].getBook().getId())) {
                return true;
            }
            //mCart[i].setCount(mCart[i].getCount() + 1);
        }
        return true;
    }

        public void appendBook (Book book) {
            this.mCart[this.mCartItemCount] =new CartItem(book);
            this.mCartItemCount++;
        }

        public void inCreaseBookCount (String bookId){
            for (int i = 0; i < this.mCartItemCount; i++) {
                if
            }
        }

    }

