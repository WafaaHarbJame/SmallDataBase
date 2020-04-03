package com.smalldatabaseapp.smalldatabase;

import java.lang.ref.SoftReference;
import java.util.Date;

public class Books {
    private int book_id;
    private String book_name;
    private  String book_author;
    private Date date_of_publication ;
    private int book_price;
    private int number_of_copies;
    private String book_image_url;


    public Books() {
    }


    public Books(int book_id, String book_name, String book_author, Date date_of_publication, int book_price, int number_of_copies, String book_image_url) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.date_of_publication = date_of_publication;
        this.book_price = book_price;
        this.number_of_copies = number_of_copies;
        this.book_image_url = book_image_url;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public Date getDate_of_publication() {
        return date_of_publication;
    }

    public void setDate_of_publication(Date date_of_publication) {
        this.date_of_publication = date_of_publication;
    }

    public int getBook_price() {
        return book_price;
    }

    public void setBook_price(int book_price) {
        this.book_price = book_price;
    }

    public int getNumber_of_copies() {
        return number_of_copies;
    }

    public void setNumber_of_copies(int number_of_copies) {
        this.number_of_copies = number_of_copies;
    }

    public String getBook_image_url() {
        return book_image_url;
    }

    public void setBook_image_url(String book_image_url) {
        this.book_image_url = book_image_url;
    }
}
