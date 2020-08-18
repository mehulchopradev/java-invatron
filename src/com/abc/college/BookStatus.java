package com.abc.college;

public enum BookStatus {
    // all the constants that the enum type (BookStatus) can hold

    ISSUED(1) {
        @Override
        public void issueBook(Book book) {
            System.out.println("Book " + book.title + " has already been issued");
        }

        @Override
        public void returnBook(Book book) {
            System.out.println("Book " + book.title + " is returned");
            book.setStatus(NOT_ISSUED);
        }
    },

    NOT_ISSUED(2) {
        @Override
        public void issueBook(Book book) {
            System.out.println("Book " + book.title + " is issued");
            book.setStatus(ISSUED);
        }

        @Override
        public void returnBook(Book book) {
            System.out.println("Book " + book.title + " has already been returned");
        }
    };

    // field declarations
    private int status;

    BookStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public abstract void issueBook(Book book);

    public abstract void returnBook(Book book);
}
