package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book story = new Book("Story", 60);
        Book boy = new Book("Boy", 10);
        Book river = new Book("River", 40);
        Book cleanCode = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = story;
        books[1] = boy;
        books[2] = river;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameBook() + " - " + book.getNumberPages());
        }
        System.out.println("SHIFT");
        books[0] = cleanCode;
        books[3] = story;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getNameBook() + " - " + book.getNumberPages());
        }
        System.out.println("Cycle name book");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getNameBook())) {
                System.out.println(book.getNameBook() + " - " + book.getNumberPages());
            }
        }
    }
}