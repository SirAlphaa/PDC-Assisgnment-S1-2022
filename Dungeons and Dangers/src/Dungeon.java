public class Dungeon 
{
  public static void amountOfRound()
  {
    FancyPrint.setDelay("How many rooms would you like to clear? ", 10, true);
    int userInpute = 0;
    //TODO: Work on this.
  }
  
  public static void introToDungeon()
  {
    //TODO: Replace all sysout with the fancy print one B).
    FancyPrint.setDelay("QUEST LOCATION: The Dungeons of Dangers", 10, true);
    FancyPrint.setDelay("DUNGEON LEVEL: EXTREMELY DANGEROUS", 10, true);
    FancyPrint.setDelay("QUEST GOAL: Clear out the dungeon to protect the citizens of Windhelm from the enemies", 10, true);
    Main.sleep(5000);
    Main.clearScreen();
    FancyPrint.setDelay("You ascend the mountain to enter the accursed cave. . .", 10, true); //TODO: maybe add fancy loading dots.
    FancyPrint.setDelay("You descend into the depths of the dungeon. . .", 10, true);
  }

  //Used after defeating the first enemy
  public static void choiceOfDirection()
  {
    System.out.println("You approach a split in the narrow hallways, the left is a dugged out hole and the right looks like it was destroyed by something unsual");
    Main.sleep(2000);
    Main.clearScreen();
    FancyPrint.setDelay("Which direction do you choose? ", 10, true);
    FancyPrint.setDelay(" (1) for left", 10, true);
    FancyPrint.setDelay(" (2) for right", 10, true);

    
  }

  public static void leftPath()
  {
    System.out.println("Weird sound path leads towards to an enemt eating original adventurer or something");
  }

  public static void rightPath()
  {
    System.out.println("Path goes on for a while or something idk, then you encounter another 2 pathways, except one has been dug out really bad, like a beast has dug through it");

  }
}