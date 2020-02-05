package com.alpha.work1;

import com.sun.istack.internal.NotNull;

public class Runner {
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

        Book[] books = createBookArray(7);
        printBookArray(books);
        inflation(books, 10.0);
        printBookArray(books);
    }
    public Book[] createBookArray(int howMuch) {
        Book[] books = new Book[howMuch];
        for (int i = 0; i < howMuch; i++) {
            books[i] = new Book((i+1), "Book #" + i, "", "", "2020", (100 * i + i),
                    200 * i + 10*i + i + (double)i/5);
        }
        return books;
    }
    public static void printBookArray (Book[] books) {
        for(Book b : books) {b.view();}
    }
    public static void inflation (Book[] books, double i) {
        for(Book b : books) {b.setPrice((1 + i/100) * b.getPrice());}
    }

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.run();
    }
}

