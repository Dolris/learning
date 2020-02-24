package com.alpha.work1;

import java.util.ArrayList;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String issuer;
    private String year;
    private Integer pages;
    private Double price;
    private static int booksCounter = 0;
    public static int getBooksCounter() {return booksCounter;}
    public static ArrayList<Book> allBooks = new ArrayList<>();
    public void setId(Integer id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setAuthor(String author) {this.author = author;}
    public void setIssuer(String issuer) {this.issuer = issuer;}
    public void setYear(String year) {this.year = year;}
    public void setPages(Integer pages) {this.pages = pages;}
    public void setPrice(Double price) {this.price = price;}
    public Integer getId() {return this.id;}
    public String getName() {return this.name;}
    public String getAuthor() {return this.author;}
    public String getIssuer() {return this.issuer;}
    public String getYear() {return this.year;}
    public Integer getPages() {return this.pages;}
    public Double getPrice() {return this.price;}
    public String toString() {
        return "Book #" + getId() + " '" + getName() + "' of '" + getAuthor() + "' issued by '" + getIssuer() +
                "' in " + getYear() + ", " + getPages() + " pages, price is " +  String.format("%.2f%n", this.price);
    }
    public void view() {System.out.println(this);}
    public Book() {
        this("", "", "", "", -1, -1);
    }
    public Book (String name, String author, String issuer, String year, int pages, double price) {
        this.setId(booksCounter++);
        this.setName(name);
        this.setAuthor(author);
        this.setIssuer(issuer);
        this.setYear(year);
        this.setPages(pages);
        this.setPrice(price);
        allBooks.add(this);
    }
    public Book (String name, String author, String issuer, String year, int pages) {
        this(name, author, issuer, year, pages, 0);
    }
}
