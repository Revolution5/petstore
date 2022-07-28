import java.util.ArrayList;
public class PetStore {
  
  private String address;
  private String phoneNumber;
  private String email;
  
  private ArrayList<Animal> animals = new ArrayList<Animal>();

  public PetStore(String address, String phoneNumber, String email) {
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void removeAnimal(Animal animal) {
    animals.remove(animal);
  }

  public Animal getAnimal(int index) {
    return animals.get(index);
  }

  public void listAnimals() {
    int i = 1;
    for(Animal animal : animals) {
      System.out.println(i + ". " + animal.getName());
      i++;
    }
  }
  
}