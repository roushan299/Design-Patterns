package creational.factory;

public  abstract class PizzaStore {

//    SimplePizzaFactory simplePizzaFactory;
//
//    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
//        this.simplePizzaFactory = simplePizzaFactory;
//    }
    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {

        Pizza pizza = null;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }



}
