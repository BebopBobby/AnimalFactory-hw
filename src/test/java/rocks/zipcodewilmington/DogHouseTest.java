package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

public class DogHouseTest {

    Dog dog = new Dog("Spike", new Date(2013, 2, 12), 12345);

    DogHouse house = new DogHouse();

    @Test
    public void addTest(){
        house.add(dog);

        Assert.assertTrue(house.getNumberOfDogs() == 1);
    }

    @Test
    public void removeByIdTest(){
        house.add(dog);

        house.remove(12345);

        Assert.assertTrue(house.getNumberOfDogs() == 0);
    }

    @Test
    public void removeByDogTest(){
        house.add(dog);

        house.remove(dog);

        Assert.assertTrue(house.getNumberOfDogs() == 0);
    }

    @Test
    public void getByIdTest(){
        house.add(dog);

        house.getDogById(12345);

        Assert.assertTrue(house.getDogById(12345) == dog);
    }

    @Test
    public void testGetNumberOfDogs() {
        house.add(dog);

        Assert.assertTrue(house.getNumberOfDogs() == 1);
    }
}
