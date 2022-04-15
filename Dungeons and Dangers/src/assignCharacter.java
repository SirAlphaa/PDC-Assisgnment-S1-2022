import java.util.HashMap;

public class assignCharacter {
    
    /**
     * Reads the hash map, waits for user to input character name, checks if it exists than applies the character to the object
     * @param userCharacter The object that the usercharacter will be written into
     * @return the user character.
     */
    public static UserCharacter select(UserCharacter userCharacter) {

        HashMap<String, Integer> characters = new HashMap<>();
        characters = FileInterface.readRecordHashMap(characters, "UserCharacter.txt");
        String uInput = "";

        Main.clearScreen();
        FancyPrint.setDelay("Please enter your saved Character's name", 30, true);
        uInput = CustomScan.scanString();

        if (characters.containsKey(uInput)) {
            userCharacter.setCharacter(uInput, characters.get(uInput));
            
            FancyPrint.newLine();
            FancyPrint.setDelay("Welcome back " + uInput, 30, true);
            FancyPrint.setDelay("You are a " + userCharacter.role + " with a " + userCharacter.weapon, 30, true);
            Main.sleep(2000);
        } else {
            FancyPrint.newLine();
            FancyPrint.setDelay("Sorry, that character does not exist, please restart the game and make a new one", 30, true);
            System.exit(0);
        }
        
        return userCharacter;
    }

}
