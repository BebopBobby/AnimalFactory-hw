package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

public class CatTest {

    Cat cat = new Cat("Checkers", new Date(2018, 2, 22), 2);

    @Test
   public void setNameTest(){

        cat.setName("Shadow");

        Assert.assertTrue(cat.getName() == "Shadow");
    }

    @Test
    public void speakTest(){
        Assert.assertTrue(cat.speak() == "meow!");
    }

    @Test
    public void setBirthdayTest(){
        Date date = new Date(2018, 1, 22);
        cat.setBirthDate(date);

        Assert.assertTrue(cat.getBirthDate() == date);
    }

    @Test
    public void eatTest(){
        Food fish = new Food();
        cat.eat(fish);

        Assert.assertTrue(cat.getNumberOfMealsEaten() == 1);
    }

    @Test
    public void getIdTest(){
        Assert.assertTrue(cat.getId() == 2);
    }

    @Test
    public void animalTest(){
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalTest(){
        Assert.assertTrue(cat instanceof Mammal);
    }
}

