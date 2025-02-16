package Exercise2;

public class Cat extends Animal{
  String breed;

  public Cat(String id, String source, Date dateOfBirth, String color, String breed){
    super(id, source, dateOfBirth, color);
    this.breed = breed;
  }
  
  @Override
  public void makeSound(){
    System.out.println("Meow Meow");
  }

  @Override
  public String toString(){
    return super.toString() + ", Breed: " + breed;
  }
}
  