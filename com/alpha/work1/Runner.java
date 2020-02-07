package com.alpha.work1;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Runner {
    public Book[] books;
    public void run() {
        Book book1 = new Book();
        book1.setId(101);
        book1.setName("Якась цікава книжка, мабуть");
        book1.setAuthor("Невідомий Орест Прокопович");
        book1.setIssuer("Дубова липа");
        book1.setYear("2019");
        book1.setPages(325);
        book1.setPrice(224.99);

        Book book2 = new Book(102, "Книжка 2", "Невідомий Орест Прокопович", "Зрада", "2019", 400,525.00);
        Book book3 = new Book("Книжка 3", "Невідомий Орест Прокопович", "Зрада", "2020", 420);
        book1.view();
        book2.view();
        book3.view();
        System.out.println("=======================================");
        System.out.println("Creating books");
        Book[] books = createBookArray(7);
        printBookArray();
        System.out.println("Inflation");
        inflation( 10.0);
        printBookArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Search books by author: ");
        printBooksByAuthor(sc.nextLine());
        System.out.print("Search books by issuer: ");
        printBooksByIssuer(sc.nextLine());
        System.out.print("Search books issued after: ");
        printBooksIssuedAfter(sc.nextInt());

    }
    public Book[] createBookArray(int howMuch) {
        books = new Book[howMuch];
        for (int i = 0; i < howMuch; i++) {
            books[i] = new Book((i+1), "Book #" + i, "Author #" + i, "Issuer_" + i, "2020", (100 * i + i),
                    200 * i + 10*i + i + (double)i/5);
        }
        return books;
    }
    public void printBookArray () {
        for(Book b : books) {b.view();}
    }
    public void inflation (double i) {
        for(Book b : books) {b.setPrice((1 + i/100) * b.getPrice());}
    }
    public void printBooksByAuthor(String author) {
        boolean found = false;
        for(Book b : books) {
            if (b.getAuthor().equals(author)) {
                found = true;
                b.view();
            }
        }
        if (!found) {System.out.println("Books not found");}
    }
    public void printBooksByIssuer(String issuer) {
        boolean found = false;
        for(Book b : books) {
            if (b.getIssuer().equals(issuer)) {
                found = true;
                b.view();
            }
        }
        if (!found) {System.out.println("Books not found");}
    }
    public void printBooksIssuedAfter(int year) {
        boolean found = false;
        for(Book b : books) {
            if (Integer.parseInt(b.getYear()) > year) {
                found = true;
                b.view();
            }
        }
        if (!found) {System.out.println("Books not found");}
    }

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.run();
    }
}

