public class Superhero {
  private String name;
  private String costume;
  private String weapon;
  private boolean life = true;
  private int weaponStrength = 0;

  // TODO #1: Add missing constructors. Note that the life attribute should default to true and the weaponStrength attribute should default to 0.
  
  public Superhero(String name, String costume, String weapon, boolean life, int weaponStrength) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = life;
    this.weaponStrength = weaponStrength;

  }

  public Superhero(String name, String costume, String weapon) {
    this.name = name;
    this.costume = costume;
    this.weapon = weapon;
    this.life = true;
    this.weaponStrength = 0;

  }

  // TODO #2: Add missing methods.
  public void details() {

    System.out.println("Superhero details: ");
    System.out.println(toString());

  }

  public void loseLife() {
    this.life = false;
  }
  
  // TODO #3: Including a toString() method (see 2.7) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "name: " + this.name + "\n" + "costume: " + this.costume + "\n" + "weapon: " + this.weapon + "\n" + "life: " + this.life + "\n" + "weapon strength: " + this.weaponStrength + "\n";
    return superHeroDetails;
  }
}