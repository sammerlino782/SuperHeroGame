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
    this.weaponStrength = (int) (Math.random() * 10) + 1;

  }

  // TODO #2: Add missing methods.

  public void loseLife() {
    this.life = false;
  }

  public String getWeapon() {
    return this.weapon;
  }

  public int getWeaponStrength() {
    return this.weaponStrength;
  }

  public String getHeroName() {
    return this.name;
  }

  public static void superHeroFight(Superhero superhero1, Superhero superhero2) {

    String superHero1weapon = superhero1.getWeapon();
    int superHero1weaponStrength = superhero1.getWeaponStrength();
    String superHero1Name = superhero1.getHeroName();

    String superHero2weapon = superhero2.getWeapon();
    int superHero2weaponStrength = superhero2.getWeaponStrength();
    String superHero2Name = superhero2.getHeroName();

    if (superHero1weaponStrength > superHero2weaponStrength) {
      System.out.print(superHero1Name);
      System.out.print(" won using " + superHero1weapon + "\n");
    } else if (superHero1weaponStrength < superHero2weaponStrength) {
      System.out.print(superHero2Name);
      System.out.print(" won using " + superHero2weapon + "\n");
    } else {
      System.out.println("The two heroes were equally matched!");
    }

  }

  
  // TODO #3: Including a toString() method (see 2.7) to help with printing out the Superhero details.
  public String toString(){
  // all your code below to create a string with details
    String superHeroDetails = "Superhero details\n" 
    + "    name: " + this.name + "\n" 
    + "    costume: " + this.costume + "\n" 
    + "    weapon: " + this.weapon + "\n" 
    + "    life: " + this.life + "\n"
    + "    weapon strength: " + this.weaponStrength + "\n";
    return superHeroDetails;
  }
}