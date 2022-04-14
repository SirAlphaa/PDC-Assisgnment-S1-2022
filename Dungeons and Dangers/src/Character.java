public abstract class Character {

   String name, weapon, gender, role;
   int healthPoints, attributes; 

   /**
    * 
    * @param n Input the name of the charcter.
    * @param attributes only 3 digits are to be entered (EG, 111, 122, 233...) Attributes
      1st digit 	= Gender 		{Male , Female}
      2nd digit 	= Role 			{Mage, knight, Assassin, Soldier}
      3rd digit	= Weapon 		{Staff, Sword, Dagger, Gun} 
    */
   public abstract void setCharacter(String n, Integer attributes);

   /**
    * @return the total damage dealt by the character 
    */
   public abstract int attack();

   public void damage() {};

   /**
    * This class converts and assigns the attributes to the corrsonding variables. 
    * @param attributesonly 3 digits are to be entered (EG, 111, 122, 233...) Attributes
      1st digit 	= Gender 		{Male , Female}
      2nd digit 	= Role 			{Mage, knight, Assassin, Soldier}
      3rd digit	= Weapon 		{Staff, Sword, Dagger, Gun} 
    */
   public void assignAttributes(int attributes) {
      String strAttribute = Integer.toString(attributes);
      char[] attributeArray = new char[strAttribute.length()];
      for (int i = 0; i < strAttribute.length(); i++) {
         attributeArray[i] = strAttribute.charAt(i);
      }
      switch (Integer.parseInt(String.valueOf(attributeArray[0]))) {
         case 1:
            gender = "Male";
            break;
         case 2:
            gender = "Female";
            break;
      }
      switch (Integer.parseInt(String.valueOf(attributeArray[1]))) {
         case 1:
            role = "Mage";
            break;
         case 2:
            role = "Knight";
            break;
         case 3:
            role = "Assassin";
            break;
         case 4:
            role = "Soldier";
      }
      switch (Integer.parseInt(String.valueOf(attributeArray[2]))) {
         case 1:
            weapon = "Staff";
            break;
         case 2:
            weapon = "Sword";
            break;
         case 3:
            weapon = "Dagger";
            break;
         case 4:
            weapon = "Gun";
            break;
      }
   }

   /**
    * Calculates the HP for the Character
    * @param gender 
    * @param role
    */
   public void calculateHP(String gender, String role) {
      int tempHP = 0;
      switch (gender) {
         case "Male":
            tempHP = tempHP + 100;
            break;
         case "Female":
            tempHP = tempHP + 95;
            break;
      }
      switch (role) {
         case "Mage":
            tempHP = tempHP - 2;
            break;
         case "Knight":
            tempHP = tempHP + 2;
            break;
      }
      healthPoints = tempHP;
   }

   public int getHP() {
      return healthPoints;
   }

   public String getName() {
      return name;
   }

   public String getWeapon() {
      return weapon;
   }

   public String getGender() {
      return gender;
   }

   public String getRole() {
      return role;
   }

}




// public abstract class Character {
//    String name;
//    String weapon;
//    String gender;
//    String role;
//    int heathPoints;

//    private static int damage;

//    public Character(int healthBar, int damage, String name, String weapon, String gender, String role) {
//       this.heathPoints = healthBar;
//       Character.damage = damage;
//       this.name = name;
//       this.weapon = weapon;
//       this.gender = gender;
//       this.role = role;
//    }

//    public int getDamage() {
//       return damage;
//    }

//    public int getHealthBar() {
//       return heathPoints;
//    }

//    public void setDamage(int newDamage) {
//       Character.damage = newDamage;
//    }

//    public void setHealthBar(int newHealthBar) {
//       this.heathPoints = newHealthBar;
//    }

//    // Method for if the user chooses to attack an enemy
//    public int Attack() {
//       FancyPrint.setDelay("What type of attack, Melee or Magic", 20, true);
//       FancyPrint.setDelay("For Melee input (1) ", 20, true);
//       FancyPrint.setDelay("For Magic input (2) ", 20, true);
//       int choice = CustomScan.scanInt();

//       //FIXME: I have a headache so Ill fix this another time properly
//       switch (choice) {
//          case 1:
//             if (weapon.equals("002")) {
//                //If weapon is a Sword
//                damage = 10;
//             }
//             break;
            
//          case 2:
//             if (weapon.equals("001")) {
//                //If weapon is a Staff
//                damage = 5;
//             }
//          default:
//             break;
//       }
//       return damage;
//    }

//    // Method for if the user chooses to defend from an enemy
//    public static int Defend() {
//       // TODO: Use random number generator for chance of block.
//       return 0;
//    }
// }