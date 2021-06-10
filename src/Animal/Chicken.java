package Animal;
import edible.Edible;

public  class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chichken: cluck cluck!";
    }
    public String howToEat(){
        return "Fried";
    }
}
