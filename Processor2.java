package Exercise2;

import java.util.ArrayList;

public class Processor2{
  public static void main(String[] args){
    AnimalList animalList = new AnimalList();

    Dog dog1 = new Dog("D1", "Home", new Date(), "Brown", "Bulldog");
    Cat cat1 = new Cat("C1", "Home", new Date(), "White", "Persian");
    Dog dog2 = new Dog("D2", "Farm", new Date(), "Black", "Labrador");
    Cat cat2 = new Cat("C2", "Shlter", new Date(), "Gray", "Siamese");

    animalList.addAnimal(dog1);
    animalList.addAnimal(cat1);
    animalList.addAnimal(dog2);
    animalList.addAnimal(cat2);

    animalList.displayAll();   
  }
}
  