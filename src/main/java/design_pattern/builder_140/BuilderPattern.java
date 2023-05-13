package design_pattern.builder_140;

// Product
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void describePizza() {
        System.out.println("Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.");
    }
}

// Builder
interface PizzaBuilder {
    void buildDough();

    void buildSauce();

    void buildTopping();

    Pizza getPizza();
}

// Concrete Builder
class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("thin crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}

// Director
class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructPizza() {
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
    }
}

// Client code
public class BuilderPattern {
    public static void main(String[] args) {
        PizzaBuilder builder = new MargheritaPizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);

        director.constructPizza();

        Pizza pizza = builder.getPizza();
        pizza.describePizza();
    }


/*  In this example, we have a Pizza class representing the product. The Pizza class has setters for the different attributes of the pizza.

    The PizzaBuilder interface defines the builder's methods for setting the dough, sauce, and topping of the pizza. Each concrete builder, like MargheritaPizzaBuilder, implements these methods to construct
    a specific type of pizza.

    The PizzaDirector class controls the construction process by using the builder interface. It provides a higher-level interface for constructing the pizza.

    In the client code, we create a MargheritaPizzaBuilder and pass it to the PizzaDirector. We then call constructPizza() on the director, which orchestrates the construction process using the builder's
    methods. Finally, we retrieve the constructed pizza using getPizza() from the builder and call `describePizza()` */
}

