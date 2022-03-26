package com.priyakdey.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author Priyak Dey
 */
public class Sandwich {

    private Bread bread;
    private Meat meat;
    private List<Sauce> sauces;
    private List<Veggies> veggies;

    private Sandwich(SandwichBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.sauces = builder.sauces;
        this.veggies = builder.veggies;
    }

    public static SandwichBuilder builder(Bread bread, Meat meat) {
        return new SandwichBuilder(bread, meat);
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public List<Sauce> getSauces() {
        return new ArrayList<>(sauces);
    }

    public List<Veggies> getVeggies() {
        return new ArrayList<>(veggies);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Sandwich.class.getSimpleName() + "[", "]")
                .add("bread=" + bread)
                .add("meat=" + meat)
                .add("sauces=" + sauces)
                .add("veggies=" + veggies)
                .toString();
    }

    public final static class SandwichBuilder {
        private Bread bread;
        private Meat meat;
        private List<Sauce> sauces;
        private List<Veggies> veggies;

        private SandwichBuilder(Bread bread, Meat meat) {
            this.bread = bread;
            this.meat = meat;
        }

        public SandwichBuilder sauces(List<Sauce> sauces) {
            this.sauces = sauces;
            return this;
        }

        public SandwichBuilder veggies(List<Veggies> veggies) {
            this.veggies = veggies;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }

    }

    public enum Bread {
        MULTIGRAIN,
        REGULAR
    }

    public enum Meat {
        CHICKEN_TERIYAKI,
        CHICKEN_PERI_PERI
    }

    public enum Sauce {
        MAYONNAISE,
        SOUTHWEST,
        RED_CHILLI,
        BARBEQUE
    }

    public enum Veggies {
        CUCUMBER,
        ONION,
        JALAPENO,
        PICKLE,
        LETTUCE,
        BLACK_OLIVES
    }
}


