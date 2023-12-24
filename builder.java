public class Pizza {

    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public abstract void setDough();

    public abstract void setSauce();

    public abstract void setTopping();

    public Pizza getPizza() {
        return pizza;
    }
}

public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void setDough() {
        pizza.setDough("Thin crust");
    }

    @Override
    public void setSauce() {
        pizza.setSauce("Tomato sauce");
    }

    @Override
    public void setTopping() {
        pizza.setTopping("Ham, pineapple");
    }
}

public class Client {

    public static void main(String[] args) {
        PizzaBuilder builder = new HawaiianPizzaBuilder();
        builder.setDough();
        builder.setSauce();
        builder.setTopping();

        Pizza pizza = builder.getPizza();
        System.out.println(pizza);
    }
}
