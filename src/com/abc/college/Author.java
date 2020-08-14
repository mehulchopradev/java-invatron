package com.abc.college;

public class Author {

    String name;
    char gender;
    int ratings;

    public Author(String name, char gender, int ratings) {
        this.name = name;
        this.gender = gender;
        this.ratings = ratings;
    }

    String getDetails() {
        return "Name: " + this.name + "\nRatings: " + this.ratings + "\nGender: " + this.gender + "\n";
    }
}
