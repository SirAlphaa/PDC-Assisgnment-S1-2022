import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CreateCharacter
{
   //TODO: Use buffer reader and printwriter to check if the user exits, or make a new one and save progress with hash map.
   //TODO: Replace scanners with CustomScanner class ones.
   static HashMap<String, Integer> player = new HashMap<>();
   player = FileInterface.readRecordHashMap("UserCharacter.txt");
   static BufferedWriter br;

   public static void createPlayer()
   {
      //name (key) for hashmap
      String name; 
      //attribute (value) for hashmap
      Integer attributes = 000;
   
      //Printing out basic text to introduce a new character creation
      FancyPrint.setDelay("Whats your name, Adventurer?: ", 20 , true);

      String inputName = "";
      inputName = CustomScan.scanString();
      
      name = inputName;
      FancyPrint.setDelay("Input your character loadout in order of sex, class and weapon: ", 10, true);
      FancyPrint.setDelay("100 is Male and 200 is Female", 10, true);
      FancyPrint.setDelay("010 is a Mage and 020 is a Knight", 10, true);
      FancyPrint.setDelay("001 is a Staff and 002 is a Sword", 10, true);
      //Scanner used to input attributes as an integer value
      //TODO: Fix yo if statement for this
      Integer input = CustomScan.scanInt();


      //If statement depending on values chosen in scanner, e.g a male knight with a sword would be saved into the hashmap
      if (input.equals(111))
      {
         FancyPrint.setDelay("You are a Male Mage, wielding a staff!", 10, true);
         attributes = 111;
         player.put(name, attributes);
      }
      else if (input.equals(211))
      {
         FancyPrint.setDelay("You are a Female Mage, wielding a staff!", 10, true);
         attributes = 211;
         player.put(name, attributes);
      }
      else if (input.equals(122))
      {
         FancyPrint.setDelay("You are a Male Knight, wielding a sword!", 10, true);
         attributes = 122;
         player.put(name, attributes);
      }
      else if (input.equals(222))
      {
         FancyPrint.setDelay("You are a Female Knight, wielding a Sword!", 10, true);
         name = inputName;
         attributes = 222;
         player.put(name, attributes);
      }
      //TODO: Add the 'Player' hashmap into a text file.
      
      //FIXME: Check if lines 63 to 97 are good?
      //TODO: Not use map interface XD.
      //TODO: Alternative is to use Task2_03 as a template for the Bufferreader and PrintWriter.
      //TODO: Fix yo character.txt file
      
      //Save the new values of the hashmap into a file (UserCharacter.txt)
      final  String outputFilePath = "./Dungeons and Dangers/resourses/UserCharacter.txt";
      File file = new File(outputFilePath);

      BufferedWriter bf = null;
      
      try
      {
          //create new BufferedWriter for the output file
         bf = new BufferedWriter( new FileWriter(file) );

         //iterate map entries
         for(Map.Entry<String, Integer> entry : player.entrySet())
         {
              //put key and value separated by a space
            bf.write(entry.getKey() + " " + entry.getValue());
            
              //new line
            bf.newLine();
         }
         bf.flush();
      } catch(IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            //always close the writer
            bf.close();
         }catch(Exception e){}
      }
   }
   //TODO: Use FileReader to read the users Name and Attributes from a text file
   //This method grabs an existing player made from the UserCharacter.txt file
   public static void existingPlayer()
   {
      FancyPrint.setDelay("Welcome back Adventurer!", 10, true);
      }
}