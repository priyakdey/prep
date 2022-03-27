package com.priyakdey.prototype;

/**
 * @author Priyak Dey
 */
public abstract class Item implements Cloneable {
    protected Type type;
    private String name;
    private String url;


    public Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public Item clone() throws CloneNotSupportedException {
        return (Item) super.clone();
    }
}
