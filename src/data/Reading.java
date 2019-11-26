package data;

import java.time.LocalDate;
import java.util.Date;

public class Reading {
    private  int id;
    private Date takeDate;
    private Date returnDate;
    private Book book;

    public Reading(){}

    public Reading(Date takeDate, Date returnDate, Book book) {
        this.takeDate = takeDate;
        this.returnDate = returnDate;
        this.book = book;
    }

    protected Reading(Date takeDate, Date returnDate, Book book,int id) {
        this.takeDate = takeDate;
        this.returnDate = returnDate;
        this.book = book;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setId() {}

    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
