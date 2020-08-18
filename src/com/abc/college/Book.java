package com.abc.college;

public class Book {

    String title;
    private int pages;
    private double price;
    // private attribute

    Author[] authors; // default value will be null. But authors has the capability to store
    // address of an Author[] object in the memory

    private BookStatus status;

    public Book(String title, int pages, double price) {
        this(title, pages, price, null);
    }

    public Book(String title, int pages, double price, Author[] authors) {
        this.title = title;
        this.pages = pages;
        setPrice(price);
        this.authors = authors;
        this.status = BookStatus.NOT_ISSUED;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            System.out.println("Is it a book!");
        } else {
            this.pages = pages;
        }
    }

    // public setter for the private attribute
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be more than 0");
        }
    }

    // public getter for the private attribute
    public double getPrice() {
        return this.price;
    }

    // encapsulation
    // 1. private attribute
    // 2. public getter and setter methods to access those private attributes. getPropertyName, setPropertyName

    public String getDetails() {
        String part1 = "Title: " + this.title + "\nPages: " + this.pages + "\nPrice: " + this.price;

        String part2 = "";
        Author[] authors = this.authors;
        if (authors != null) {
            for(int i = 0; i < authors.length; i++) {
                Author author = authors[i];
                part2 += author.getDetails();
            }
        }

        return part1 + "\n" + part2;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void returnBook() {
        /* if (this.status == BookStatus.NOT_ISSUED) {
            System.out.println("Book " + this.title + " has already been returned");
            return;
        }

        System.out.println("Book " + this.title + " is returned");
        this.status = BookStatus.NOT_ISSUED; */
        this.status.returnBook(this);
    }

    public void issue() {
        /* if (this.status == BookStatus.ISSUED) {
            System.out.println("Book " + this.title + " has already been issued");
            return;
        }

        System.out.println("Book " + this.title + " is issued"); */
        this.status.issueBook(this);
    }

    public boolean canIssue() {
        return this.status != BookStatus.ISSUED;
    }
}
