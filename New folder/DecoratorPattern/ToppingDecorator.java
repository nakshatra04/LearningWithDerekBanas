package DecoratorPattern;

/**
 * Created by Sohrab-PC on 12/15/2016.
 */
// Has a "Has a" relationship with Pizza. This is an
// Aggregation Relationship

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    // Assigns the type instance to this attribute
    // of a Pizza

    // All decorators can dynamically customize the Pizza
    // instance PlainPizza because of this

    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    public String getDescription() {

        return tempPizza.getDescription();

    }

    public double getCost() {

        return tempPizza.getCost();

    }

}