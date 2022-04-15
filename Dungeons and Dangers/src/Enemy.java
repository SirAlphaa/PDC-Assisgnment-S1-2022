
public class Enemy extends Character{

  @Override
  public void setCharacter(String n, Integer attributes) {
    name = n;
    assignAttributes(attributes);
    calculateHP(gender, role);
  }

  @Override
  public int attack() {
    
    int attackChoice = RandomGenerator.randomNumber(1, 3);
    String attackName = "";
    int damage = 0;

    switch (weapon) {

      case "Staff":
        switch (attackChoice) {
          case 1:
            attackName = "Water Splash";
            damage = 8;
            break;
          case 2:
            attackName = "Rock Rain";
            damage = 10;
            break;
          case 3:
            attackName = "Primordial Burst";
            damage = 15;
            break;
          default:
            System.out.println("Enemy.java weapon attack choice switch class error");
            System.exit(1);
            break;
        }
        break;

      case "Sword":
        switch (attackChoice) {
          case 1:
            attackName = "Stab";
            damage = 8;
            break;
          case 2:
            attackName = "Slash";
            damage = 10;
            break;
          case 3:
            attackName = "Cataclysm";
            damage = 15;
            break;
          default:
            System.out.println("Enemy.java weapon attack choice switch class error");
            System.exit(1);
            break;
        }
        break;

      case "Dagger":
        switch (attackChoice) {
          case 1:
            attackName = "Poke";
            damage = 8;
            break;
          case 2:
            attackName = "Backstab";
            damage = 10;
            break;
          case 3:
            attackName = "Two-Shiv Poison";
            damage = 15;
            break;
          default:
            System.out.println("Enemy.java weapon attack choice switch class error");
            System.exit(1);
            break;
        }
        break;

      case "Gun":
        switch (attackChoice) {
          case 1:
            attackName = "Handgun";
            damage = 8;
            break;
          case 2:
            attackName = "Rocket";
            damage = 10;
            break;
          case 3:
            attackName = "Ace in the Hole";
            damage = 15;
            break;
          default:
            System.out.println("Enemy.java weapon attack choice switch class error");
            System.exit(1);
            break;
        }
        break;

      default:
        System.out.println("Enemy.java weapon switch class error");
        System.exit(1);
        break;
    }

    FancyPrint.setDelay(name + " attacked with " + attackName, 20, true);
    return damage;
  }

}


// Implement a random number generator to give enemies random dmg at a
// cap.
// Create different enemies and bosses.

// public static void Goblin()
// {
// FancyPrint.setDelay(" ", 10, true);
// Create a cool opening scene for each monster that appears.
// //Add ability for goblin to shapeshift to adventurer at 75% effective power.
// }

// public static void greatWolfKing()
// {
// //Crit does double dmg only
// }

// public static void Ogre()
// {
// //Crit can deal 4x dmg
// }

// public static void Dragon()
// {
// //Double dmg by magic dmg
// }

// public static void Gromp()
// {
// //Can get one shot by swordm and two shot by magic lmao
// }

// public static void undeadKnight()
// {
// //Double dmg by magic dmg
// }

// public static void enemyChosen()
// {
// Use random generator of enemy chosen, make sure the same enemy doesnt
// spawn twice.
// }
// }