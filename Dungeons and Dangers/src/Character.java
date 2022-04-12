public abstract class Character {
   String name;
   static String weapon;
   String gender;
   String role;
   int heathPoints;
   
   private static int damage;

   public Character(int healthBar, int damage, String name, String weapon, String gender, String role) {
      this.heathPoints = healthBar;
      Character.damage = damage;
      this.name = name;
      this.weapon = weapon;
      this.gender = gender;
      this.role = role;
   }

   public int getDamage() {
      return damage;
   }

   public int getHealthBar() {
      return heathPoints;
   }

   public void setDamage(int newDamage) {
      Character.damage = newDamage;
   }

   public void setHealthBar(int newHealthBar) {
      this.heathPoints = newHealthBar;
   }

   // Method for if the user chooses to attack an enemy
   public static int Attack() {
      FancyPrint.setDelay("What type of attack, Melee or Magic", 20, true);
      FancyPrint.setDelay("For Melee input (1) ", 20, true);
      FancyPrint.setDelay("For Magic input (2) ", 20, true);
      int choice = CustomScan.scanInt();

      //FIXME: I have a headache so Ill fix this another time properly
      switch (choice) {
         case 1:
            if (weapon.equals("002")) {
               //If weapon is a Sword
               damage = 10;
            }
            break;
            
         case 2:
            if (weapon.equals("001")) {
               //If weapon is a Staff
               damage = 5;
            }
         default:
            break;
      }
      return damage;
   }

   // Method for if the user chooses to defend from an enemy
   public static int Defend() {
      // TODO: Use random number generator for chance of block.
      return 0;
   }
}