package rocks.zipcodewilmington.animals.animal_creation;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
}
