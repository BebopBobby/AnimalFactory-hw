package rocks.zipcodewilmington;


import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

public class AnimalFactoryTest {
    @Test
    public void createDogTest(){
        AnimalFactory test = new AnimalFactory();
        String expectedName = "Spike";
        Date expectedDate = new Date(2016, 7, 26);

        String actualName = test.createDog("Spike", new Date(2016, 7, 26)).getName();
        Date actualDate = test.createDog("Spike", new Date(2016, 7, 26)).getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    @Test
    public void createCatTest(){
        AnimalFactory test = new AnimalFactory();
        String expectedName = "Spot";
        Date expectedDate = new Date(2015, 4, 20);


        String actualName = test.createCat("Spot", new Date(2015, 4, 20)).getName();
        Date actualDate = test.createCat("Spot", new Date(2015, 4, 20)).getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
