package com.priyakdey.prototype;

import static com.priyakdey.prototype.Type.MOVIE;

/**
 * @author Priyak Dey
 */
public class Movie extends Item {

    private String runtime;

    public Movie() {
        super.type = MOVIE;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRuntime() {
        return runtime;
    }
}
