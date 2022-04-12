public class Character {
   private int healthBar = 100;
   private int damage = 0;

   public Character(int healthBar, int damage) {
      this.healthBar = healthBar;
      this.damage = damage;
   }

   public int getDamage() {
      return damage;
   }

   public int getHealthBar() {
      return healthBar;
   }

   public void setDamage(int newDamage) {
      this.damage = newDamage;
   }

   public void setHealthBar(int newHealthBar) {
      this.healthBar = newHealthBar;
   }

   // Method for if the user chooses to attack an enemy
   public static void playerAttack() {
      // TODO: Use random number generator for dmg dealt, and also if it crits for
      // double dmg.
   }

   // Method for if the user chooses to defend from an enemy
   public static void playerDefend() {
      // TODO: Use random number generator for chance of block.
   }

   // Method for if the max number of lives for the user before the game ends.
   /*
    * public static int Revive(int health)
    * {
    * //Might delte this idk
    * int hp = 3;
    * health = hp;
    * return health;
    * }
    */
}