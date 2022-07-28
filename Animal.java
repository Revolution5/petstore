public abstract class Animal {
    private String name;
    private String color;
    private String breed;
    private String gender;
    private int age;
  
    public Animal(String name, String color, String breed, String gender, int age) {
      this.name = name;
      this.color = color;
      this.breed = breed;
      this.gender = gender;
      this.age = age;
    }
  
    public String getName() {
      return this.name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getColor() {
      return this.color;
    }
  
    public void setColor(String color) {
      this.color = color;
    }
  
    public String getBreed() {
      return this.breed;
    }
  
    public void setBreed(String breed) {
      this.breed = breed;
    }
  
    public String getGender() {
      return this.gender;
    }
  
    public void setGender(String gender) {
      this.gender = gender;
    }
  
    public int getAge() {
      return this.age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    abstract void play();
    
    abstract void pet();
      
    abstract void feed(); 
    
    abstract void description();
    
  }