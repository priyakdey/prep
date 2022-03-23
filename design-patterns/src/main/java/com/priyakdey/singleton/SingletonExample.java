package com.priyakdey.singleton;

/**
 * @author Priyak Dey
 */
public class SingletonExample {

    private static volatile SingletonExample instance = null;

    private SingletonExample() {
        if (instance != null) {
            throw new RuntimeException("Calling constructor is not supported. Use getInstance() instead");
        }
    }

    public static SingletonExample getInstance() {
        // double check locking mechanism
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

}
