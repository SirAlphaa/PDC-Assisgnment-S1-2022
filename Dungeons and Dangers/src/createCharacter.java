import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CreateCharacter
{
  public static void createPlayer()
  {
    HashMap<String, Integer> Player = new HashMap<>();
    Player = FileInterface.readRecordHashMap(Player, "UserCharacter.txt");
    //name (key) for hashmap
    String name; 
    //attribute (value) for hashmap
    Integer attributes = 000;

    //Printing out basic text to introduce a new character creation
    FancyPrint.setDelay("Whats your name, Adventurer?: ", 20 , true);
    //TODO: Use buffer reader and printwriter to check if the user exits, or make a new one and save progress with hash map.
    
    //Player = FileInterface.readRecordHashMap("UserCharacter.txt");
    BufferedWriter br;
    
    String inputName = CustomScan.scanString();
    name = inputName;
    
    FancyPrint.setDelay("Input your character loadout in order of sex, class and weapon: ", 10, true);
    FancyPrint.setDelay("<100> is Male and <200> is Female", 10, true);
    FancyPrint.setDelay("<010> is a Mage and <020> is a Knight", 10, true);
    FancyPrint.setDelay("<001> is a Staff and <002> is a Sword", 10, true);
    FancyPrint.setDelay("You cannot have <010> (Mage) and <002> (Sword),", 10, true);
    FancyPrint.setDelay("or <020> (Knight) and <001> (Staff) as a loadout!", 10, true);

    //Scanner used to input attributes as an integer value
    //TODO: Fix yo if statement for this
    Integer input = CustomScan.scanInt();


    //If statement depending on values chosen in scanner, e.g a male knight with a sword would be saved into the hashmap
    // boolean newName = true;
    // while (newName)
    // {
    //   if (name.equals(null))
    //   {
    //     newName = true;
    //     FancyPrint.setDelay("Input a name please.", 10, true);
    //   }
    // }
    //TODO: Perhaps add the ability for a mage to have a sword and knight to have a staff but they have drawbacks obviously.
    boolean newAttribute = true;
    while (newAttribute)
    {
      if (input.equals(111))
      {
        FancyPrint.setDelay("You are a Male Mage, wielding a staff!", 10, true);
        attributes = 111;
        Player.put(name, attributes);
        newAttribute = false;
      }
      else if (input.equals(211))
      {
        FancyPrint.setDelay("You are a Female Mage, wielding a staff!", 10, true);
        attributes = 211;
        Player.put(name, attributes);
        newAttribute = false;
      }
      else if (input.equals(122))
      {
        FancyPrint.setDelay("You are a Male Knight, wielding a sword!", 10, true);
        attributes = 122;
        Player.put(name, attributes);
        newAttribute = false;
      }
      else if (input.equals(222))
      {
        FancyPrint.setDelay("You are a Female Knight, wielding a Sword!", 10, true);
        attributes = 222;
        Player.put(name, attributes);
        newAttribute = false;
      }
      else if (input.equals(112) || input.equals(212) || input.equals(null))
      {
        newAttribute = true;
        FancyPrint.setDelay("Wrong class and item combination! Try again please.", 10, true);
      }
    }
    //TODO: Add the 'Player' hashmap into a text file.
    //TODO: Fix yo character.txt file
    
    //=== DONT TOUCH THE READER I SWEAR TO GOD ====================================================
    FileInterface.writeRecordHasMap(Player, "UserCharacter.txt");
  }
}