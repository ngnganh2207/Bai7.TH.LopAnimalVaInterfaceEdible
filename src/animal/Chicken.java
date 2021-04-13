package animal;

import edible.Edible;
import edible.Edible2;

public class Chicken extends Animal implements Edible, Edible2 {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
    @Override
    public String howToDrink(){
        return "drink coca";
    }
}
