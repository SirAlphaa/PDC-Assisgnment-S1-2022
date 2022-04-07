import java.util.HashMap;
import java.util.Scanner;

public class UserCharacter
{
   //TODO: Use buffer reader and printwriter to check if the user exits, or make a new one and save progress with hash map.
   //TODO: Replace scanners with CustomScanner class ones.
   static HashMap<String, Integer> Player = new HashMap<String, Integer>();

   public static void createPlayer()
   {
      String name;
      Integer attributes = 000;
     
      FancyPrint.setDelay("Whats your name, Adventurer?: ", 10, true);
      Scanner scanName = new Scanner(System.in);
      String inputName = scanName.nextLine();
      name = inputName;
      FancyPrint.setDelay("Input your character loadout in order of sex, class and weapon: ", 10, true);
      FancyPrint.setDelay("100 is Male and 200 is Female", 10, true);
      FancyPrint.setDelay("010 is a Mage and 020 is a Knight", 10, true);
      FancyPrint.setDelay("001 is a Staff and 002 is a Sword", 10, true);
      Scanner scanAttribute = new Scanner(System.in);
      Integer input = scanAttribute.nextInt();

      if (input.equals(111))
      {
         FancyPrint.setDelay("You are a Male Mage, wielding a staff!", 10, true);
         attributes = 111;
         Player.put(name, attributes);
      }
      else if (input.equals(211))
      {
         FancyPrint.setDelay("You are a Female Mage, wielding a staff!", 10, true);
         attributes = 211;
         Player.put(name, attributes);
      }
      else if (input.equals(122))
      {
         FancyPrint.setDelay("You are a Male Knight, wielding a sword!", 10, true);
         attributes = 122;
         Player.put(name, attributes);
      }
      else if (input.equals(222))
      {
         FancyPrint.setDelay("You are a Female Knight, wielding a Sword!", 10, true);
         name = inputName;
         attributes = 222;
         Player.put(name, attributes);
      }
      //TODO: Add the 'Player' hashmap into a text file.
   }

   //Use FileReader to read the users Name and Attributes from a text file
   public static void existingPlayer()
   {
      FancyPrint.setDelay("Welcome back Adventurer!", 10, true);

   }

   public static void playerAttack()
   {
      //TODO: Use random number generator for dmg dealt, and also if it crits for double dmg.
   }

   public static void playerDefend()
   {
      //TODO: Use random number generator for chance of block.
   }

   public static void Revive()
   {
      
   }
}