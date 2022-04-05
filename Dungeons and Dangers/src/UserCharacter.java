import java.util.HashMap;

public class UserCharacter 
{
   //TODO: Use buffer reader and printwriter to check if the user exits, or make a new one and save progress with hash map.
   
   HashMap<String, Integer> Player = new HashMap<String, Integer>();

   public static void createPlayer()
   {
      String name;
      Integer attributes = 000;
      Integer input = 000;
     
      FancyPrint.setDelay("Whats your name, adventurer?: ", 10, true);
      //TODO: Add scanner to input name
      FancyPrint.setDelay("Input your character loadout in order of sex, class and weapon: ", 10, true);
      FancyPrint.setDelay("100 is Male and 200 is Female", 10, true);
      FancyPrint.setDelay("010 is a Mage and 020 is a Knight", 10, true);
      FancyPrint.setDelay("001 is a Staff and 002 is a Sword", 10, true);

      if (input.equals("111"))
      {
         FancyPrint.setDelay("You are a Male Mage, wielding a staff!", 10, true);
         attributes = 111;
      }
      else if (input.equals("211"))
      {
         FancyPrint.setDelay("You are a Female Mage, wielding a staff!", 10, true);
         attributes = 211;
      }
      else if (input.equals("122"))
      {
         FancyPrint.setDelay("You are a Male Knight, wielding a sword!", 10, true);
         attributes = 122;
      }
      else if (input.equals("222"))
      {
         FancyPrint.setDelay("You are a Female Knight, wielding a Sword!", 10, true);
         attributes = 222;
      }
   }

   //Use FileReader to read the users Name and Attributes from a text file
   public static void existingPlayer()
   {

   }
}