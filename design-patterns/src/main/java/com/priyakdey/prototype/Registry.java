package com.priyakdey.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.priyakdey.prototype.Type.BOOK;
import static com.priyakdey.prototype.Type.MOVIE;

/**
 * @author Priyak Dey
 */
public class Registry {
    private Map<Type, Item> registry = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(Type type) throws CloneNotSupportedException {
        Item item = registry.get(type);
        return item.clone();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setName("Batman Returns");
        movie.setUrl("https://batman.example.com");
        movie.setRuntime("2.1h");

        registry.put(MOVIE, movie);

        Book book = new Book();
        book.setName("By the river Piedra");
        book.setUrl("https://book.example.com");
        book.setAuthor("Paulo Coelho");
        registry.put(BOOK, book);
    }


}
