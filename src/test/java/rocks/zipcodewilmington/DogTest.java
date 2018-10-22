package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

public class DogTest {

    Dog dog = new Dog("Fido", new Date(2014, 5, 11), 56789);

    @Test
    public void setNameTest() {
        dog.setName("Spike");

        Assert.assertTrue(dog.getName() == "Spike");
    }

    @Test
    public void speakTest(){
        Assert.assertTrue(dog.speak() == "bark!");
    }

    @Test
    public void setBirthDateTest(){
        Date newBday = new Date(2012, 9, 23);

        dog.setBirthDate(newBday);

        Assert.assertTrue(dog.getBirthDate() == newBday);
    }

    @Test
    public void eatTest(){
        Food kibble = new Food();

        dog.eat(kibble);

        Assert.assertTrue(dog.getNumberOfMealsEaten() == 1);
    }

    @Test
    public void getIdTest(){
        Assert.assertTrue(dog.getId() == 56789);
    }

    @Test
    public void animalTest(){
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalTest(){
        Assert.assertTrue(dog instanceof Mammal);
    }
}
