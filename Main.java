import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    PetStore petStore = new PetStore("123 California Street", "123-456-7890", "DamonsPetStore@gmail.com");
    petStore.addAnimal(new Cat("Mars", "Gray", "Tabby", "male", 3 ));
    petStore.addAnimal(new Dog("Lady", "Beige", "Poodle", "female", 2));
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Damon's Pet Shop! Our address is " + petStore.getAddress() + ".");
    
    System.out.println("You can reach us by phone at " + petStore.getPhoneNumber() + " or by email at " + petStore.getEmail() + ".");
    
    Animal currentPet = getValidAnimal(petStore, sc);
    currentPet.description();
    boolean keepGoing = true;
    
    while (keepGoing) {
          System.out.println("\nWhat would you like to do?\n 1. Play\n 2. Pet\n 3. Feed\n 4. Go back to animal list\n 0. Leave");
    
    int input = sc.nextInt();
    
    switch(input) {
      case 0: System.out.println("Goodbye!");
        keepGoing = false;
        break;
      case 1: currentPet.play();
        break;
      case 2: currentPet.pet();
        break;
      case 3: currentPet.feed();
        break;
      case 4: currentPet = getValidAnimal(petStore, sc);
        break;
      default: System.out.println("Invalid Choice.");
        break;
    }
    }


    sc.close();  
  }

  public static Animal getValidAnimal(PetStore petStore, Scanner sc) {
        System.out.println("\nHere is a list of our current animals, \nplease enter the number corresponding to the animal to see details:\n");
    
    petStore.listAnimals();

    int input = 0;
    boolean keepGoing = true;

    while(keepGoing) {
      try {
        input = sc.nextInt();
        petStore.getAnimal(input - 1);
        keepGoing = false;
    }
      catch(Exception ex) {
        System.out.println("That animal does not exist! Please try again.");
        petStore.listAnimals();
      }
    }
    return petStore.getAnimal(input - 1);
  }
}