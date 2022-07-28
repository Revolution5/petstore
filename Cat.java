public class Cat extends Animal {
  
    public Cat(String name, String color, String breed, String gender, int age) {
      super(name, color, breed, gender, age);
    }
  
    @Override
    public void play() {
      System.out.println("\n" + this.getName() + " plays with a nearby toy.");
    }
  
    @Override
    public void pet() {
      if(this.getGender() == "male") {
        System.out.println("\nYou gently pet " + this.getName() + ". He purrs loudly.");
      }
      else if(this.getGender() == "female") {
        System.out.println("\nYou gently pet " + this.getName() + ". She purrs loudly.");
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
          " year old " + this.getBreed() + " cat with " + this.getColor() + " fur.");
      }
      else if(this.getGender() == "female") {
        System.out.println("\nThis is " + this.getName() + ". She is a " + this.getAge() + 
          " year old " + this.getBreed() + " cat with " + this.getColor() + " fur.");
      }
    }
  }