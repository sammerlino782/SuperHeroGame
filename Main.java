public class Main {

  public static void main(String[] args) {
    /*
     * TODO: Make changes to the Superhero class (provided in a separate file) so
     * that the following code compiles and so that each superhero's details is printed out
     * nicely
     */
    Superhero spiderman1 = new Superhero("Spiderman", "Red suit", "Super Web");
    System.out.println(spiderman1);
    Superhero batman1 = new Superhero("Batman", "Batsuit", "Super Strength");
    spiderman1.loseLife();
    batman1.loseLife();
    System.out.println(batman1);

    Superhero.superHeroFight(spiderman1,batman1);

    Superhero batman = new Superhero("Batman", "Batsuit", "Batarang");
    Superhero spiderman = new Superhero("Spiderman", "Redsuit", "Superweb");

    System.out.println(batman);
    System.out.println(spiderman);

    System.out.println("The Green Goblin shows up");
    spiderman.loseLife();
    System.out.println(spiderman);

    
  }

}
