package com.smalldatabaseapp.smalldatabase;

public class Orders {
    int userId ;
    int BookId ;

    int  bookPrice ;
    int  numberOfBooksPurchase;
    int total;


    public Orders() {
    }


    public Orders(int userId, int bookId, int bookPrice, int numberOfBooksPurchase, int total) {
        this.userId = userId;
        BookId = bookId;
        this.bookPrice = bookPrice;
        this.numberOfBooksPurchase = numberOfBooksPurchase;
        this.total = total;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getNumberOfBooksPurchase() {
        return numberOfBooksPurchase;
    }

    public void setNumberOfBooksPurchase(int numberOfBooksPurchase) {
        this.numberOfBooksPurchase = numberOfBooksPurchase;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
