package com.ssmdemo.bean;

import java.sql.Date;
import java.util.Objects;

public class Book {
    private String bookid;
    private String bookname;
    private String bookauthor;
    private String bookorigin;
    private Date bookdate;
    private String bookprice;
    private String booksum;
    public Book(){

    }

    public Book(String bookid, String bookname, String bookauthor, String bookorigin, Date bookdate, String bookprice, String booksum) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookorigin = bookorigin;
        this.bookdate = bookdate;
        this.bookprice = bookprice;
        this.booksum = booksum;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookorigin() {
        return bookorigin;
    }

    public void setBookorigin(String bookorigin) {
        this.bookorigin = bookorigin;
    }

    public Date getBookdate() {
        return bookdate;
    }

    public void setBookdate(Date bookdate) {
        this.bookdate = bookdate;
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }

    public String getBooksum() {
        return booksum;
    }

    public void setBooksum(String booksum) {
        this.booksum = booksum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid='" + bookid + '\'' +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookorigin='" + bookorigin + '\'' +
                ", bookdate='" + bookdate + '\'' +
                ", bookprice='" + bookprice + '\'' +
                ", booksum='" + booksum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookid, book.bookid) && Objects.equals(bookname, book.bookname) && Objects.equals(bookauthor, book.bookauthor) && Objects.equals(bookorigin, book.bookorigin) && Objects.equals(bookdate, book.bookdate) && Objects.equals(bookprice, book.bookprice) && Objects.equals(booksum, book.booksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookid, bookname, bookauthor, bookorigin, bookdate, bookprice, booksum);
    }
}
