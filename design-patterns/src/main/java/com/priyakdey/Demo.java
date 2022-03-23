package com.priyakdey;

import com.priyakdey.singleton.DatabaseConnection;
import com.priyakdey.singleton.SingletonExample;

/**
 * @author Priyak Dey
 */
public class Demo {

    public static void main(String[] args) throws Exception {
//        SingletonExample instance1 = SingletonExample.getInstance();
//
//        SingletonExample instance2 = SingletonExample.getInstance();
//
//        System.out.println("instance1 = " + instance1);
//        System.out.println("instance2 = " + instance2);

        // Let us  break it with Reflection first

//        Class<SingletonExample> singletonExampleClass = SingletonExample.class;
//        Constructor<SingletonExample> constructor = singletonExampleClass.getDeclaredConstructor();
//        constructor.setAccessible(true);    // This breaks the singleton. so we need to fix it
//        SingletonExample instance3 = constructor.newInstance();
//
//
//        System.out.println("instance3 = " + instance3);

        // let us break with multi threading
        Runnable runnable = () -> {
            var instance = SingletonExample.getInstance();
            System.out.println("inside the thread " + Thread.currentThread().getName() + " and instance = " + instance);
        };

        var t1 = new Thread(runnable);
        var t2 = new Thread(runnable);

        t1.start();
        t2.start();

        // get the connection object from the database connection class
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        var conn = databaseConnection.getConnection();

        var statement = conn.createStatement();
        final var rs = statement.executeQuery("SELECT CURRENT_TIMESTAMP;");

        while (rs.next()) {
            Object object = rs.getObject(1);
            System.out.println(object.toString());
        }


        rs.close();
        statement.closeOnCompletion();

        databaseConnection.close();
    }

}
