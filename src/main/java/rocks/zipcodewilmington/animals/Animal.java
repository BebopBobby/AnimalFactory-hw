package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
