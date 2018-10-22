package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    Cat cat = new Cat("Schmuckers", new Date(2017, 12, 18), 1234);
    Cat cat2 = new Cat("Shadow", new Date(2017, 12, 18), 5678);

    CatHouse house = new CatHouse();

    @Test
    public void addTest(){
        house.add(cat);

        Assert.assertTrue(house.getNumberOfCats() == 1);
    }

    @Test
    public void removeCatTest(){
        house.add(cat);

        house.remove(cat);

        Assert.assertTrue(house.getNumberOfCats() == 0);
    }

    @Test
    public void removeIdTest(){
        house.add(cat);

        house.remove(1234);

        Assert.assertNotEquals(house, cat);
    }

    @Test
    public void getCatByIdTest(){
        house.add(cat);

        house.getCatById(1234);

        Assert.assertTrue(house.getCatById(1234) == cat);
    }

    @Test
    public void getNumberOfCatsTest(){
        house.add(cat);
        house.add(cat2);

        Assert.assertTrue(house.getNumberOfCats() == 2);
    }
}
