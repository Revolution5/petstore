public class Dog extends Animal {
  
    public Dog(String name, String color, String breed, String gender, int age) {
    super(name, color, breed, gender, age);
  }

  @Override
  public void play() {
    System.out.println("\nYou throw a frisbee nearby. " + this.getName() + " fetches and returns it.");
  }

  @Override
  public void pet() {
    if(this.getGender() == "male") {
      System.out.println("\nYou gently pet " + this.getName() + ". He gives off a happy bark.");
    }
    else if(this.getGender() == "female") {
      System.out.println("\nYou gently pet " + this.getName() + ". She gives off a happy bark.");
    }
  }

  @Override
  public void feed() {
    if(this.getGender() == "male") {
      System.out.println("\nYou feed " + this.getName() + " some kibble. He seems to enjoy it.");
    }
    else if(this.getGender() == "female") {
      System.out.println("\nYou feed " + this.getName() + " some kibble. She seems to enjoy it.");
    }
  }

  @Override
  public void description() {
    if(this.getGender() == "male") {
      System.out.println("\nThis is " + this.getName() + ". He is a " + this.getAge() + 
        " year old " + this.getBreed() + " dog with " + this.getColor() + " fur.");
    }
    else if(this.getGender() == "female") {
      System.out.println("\nThis is " + this.getName() + ". She is a " + this.getAge() + 
        " year old " + this.getBreed() + " dog with " + this.getColor() + " fur.");
    }
  }
}