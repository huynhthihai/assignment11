package Exercise2;

public class Dog extends Animal{
  String breed;

  public Dog(String id, String source, Date dateOfBirth, String color, String breed){
    super(id, source, dateOfBirth, color);
    this.breed = breed;
  }
  
  @Override
  public void makeSound(){
    System.out.println("Barks barks");
  }

  @Override
  public String toString(){
    return super.toString() + ", Breed: " + breed;
  }
}
  