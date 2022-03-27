package com.priyakdey.prototype;

import static com.priyakdey.prototype.Type.BOOK;

/**
 * @author Priyak Dey
 */
public class Book extends Item {

    private String author;

    public Book() {
        super.type = BOOK;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
