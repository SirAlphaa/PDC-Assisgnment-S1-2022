public class Dungeon 
{
  //TODO: Work on commenting.
  public static void intoTheDungeon(UserCharacter user)
  {
    FancyPrint.setDelay("QUEST LOCATION: The Dungeons of Dangers", 10, true);
    FancyPrint.setDelay("DUNGEON LEVEL: EXTREMELY DANGEROUS", 10, true);
    FancyPrint.setDelay("QUEST GOAL: Clear out the dungeon to protect the citizens of Windhelm from the enemies", 10, true);
    CustomScan.enterToContinue();
    Main.clearScreen();
    FancyPrint.setDelay("You ascend the mountain to enter the accursed cave", 10, true);
    FancyPrint.setDelay("You descend into the depths of the dungeon", 10, false);
    FancyPrint.setDelay(".....", 700, true); 
    Dungeon.choiceOfDirection(user);
  }

  //Used after defeating the first enemy
  public static void choiceOfDirection(UserCharacter user)
  {
    FancyPrint.setDelay("You approach a split in the narrow hallways, the left is a cleared out hole and the right looks like it was destroyed by something unusual.", 10, true);
    FancyPrint.setDelay("Which direction do you choose? ", 10, true);
    FancyPrint.setDelay(" (1) for left", 10, true);
    FancyPrint.setDelay(" (2) for right", 10, true);
   
    int input = CustomScan.scanIntBetween(1,2);
    if (input == 1) {
      Dungeon.leftPath(user);
    } else if (input == 2) {
      Dungeon.rightPath(user);
    }
    FancyPrint.setDelay("You carry on into the Dungeon, further into its depths.", 10, true);
    CustomScan.enterToContinue();
    Main.clearScreen();

    FancyPrint.setDelay("Up in the distance is a radiating glow, it calls to you and you tremble at its glory. The Boss of the dungeon emerges, the danger increases!", 10, true);
    Main.sleep(3000);
    Enemy baron = new Enemy();
    baron.setCharacter("The Baron Nashor", 121);
    Battle.start(user, baron, 3);
    FancyPrint.setDelay("YOU HAVE CONQUERED DUNGEONS AND DRAGONS, WINDHELM IS SAVED!", 100, true);
  }

  public static void leftPath(UserCharacter user)
  {
    FancyPrint.setDelay("You enter into a large echoing room and see someone, its the first enemy!", 10, true);
    FancyPrint.setDelay("He looks really relaxed.", 10, true);
    Main.sleep(3000);
    //Queue battle class to start battle.
    Battle.start(user, 1);
  }

  public static void rightPath(UserCharacter user)
  {
    FancyPrint.setDelay("You walk for what seems for days but you dont feel exhausted nor are hungry or thirsty.", 10, true);
    FancyPrint.setDelay("You end up at a huge arena, an enemy emerges from the shadows!", 10, true);
    Main.sleep(3000);
    Battle.start(user, 2);
  }
}