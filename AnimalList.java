package Exercise2;

import java.util.ArrayList;

public class AnimalList{
  ArrayList<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal){
    animals.add(animal);
  }

  public void displayAll(){
    for(Animal animal : animals){
      System.out.println(animal);
      animal.makeSound();
    }
  }
}
  