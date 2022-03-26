package com.priyakdey;

import com.priyakdey.builder.Sandwich;

import java.util.List;

import static com.priyakdey.builder.Sandwich.Bread.MULTIGRAIN;
import static com.priyakdey.builder.Sandwich.Meat.CHICKEN_PERI_PERI;
import static com.priyakdey.builder.Sandwich.Sauce.MAYONNAISE;
import static com.priyakdey.builder.Sandwich.Sauce.SOUTHWEST;
import static com.priyakdey.builder.Sandwich.Veggies.CUCUMBER;
import static com.priyakdey.builder.Sandwich.Veggies.LETTUCE;

/**
 * @author Priyak Dey
 */
public class Demo1 {

    public static void main(String[] args) {
        var sandwich =
                Sandwich
                .builder(MULTIGRAIN, CHICKEN_PERI_PERI)
                .sauces(List.of(MAYONNAISE, SOUTHWEST))
                        .veggies(List.of(CUCUMBER, LETTUCE))
                .build();

        System.out.println("sandwich = " + sandwich);
    }

}
