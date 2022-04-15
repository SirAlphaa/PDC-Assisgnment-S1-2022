import java.util.HashMap;

public class CreateCharacter {
    public static UserCharacter createPlayer(UserCharacter userCharacter) {
        // The Hashmap.
        HashMap<String, Integer> Player = new HashMap<>();
        Player = FileInterface.readRecordHashMap(Player, "UserCharacter.txt");

        // ====================================================================================================================
        // Printing out basic text to introduce a new character creation.
        FancyPrint.setDelay("Whats your name, Adventurer?: ", 20, true);
        // name (key) for hashmap
        String name = CustomScan.scanString();

        // ====================================================================================================================
        // Use prints and scanner to ask what your loadout will be.
        FancyPrint.setDelay("Input your character loadout in order of sex, class and weapon: \n", 10, true);
        FancyPrint.setDelay("To be a Male input (1) and to become a Female input (2)", 10, true);

        // Saving input (attribute) of the sex.
        Integer sexInput = CustomScan.scanInt();

        FancyPrint.setDelay(
                "To choose the class Mage input (1) and to choose the class Knight input (2), to be a Assassin input (3) and to become a Soldier input (4)",
                10, true);

        // Saving input (attribute) of the class.
        Integer classInput = CustomScan.scanInt();

        FancyPrint.setDelay(
                "To choose a staff as your weapon input (1) and to choose a Sword as your weapon input (2) to use a Dagger input (3) and to use a Gun input (4)",
                10, true);

        // Saving input (attribute) of the weapon.
        Integer weaponInput = CustomScan.scanInt();

        // ====================================================================================================================
        // Saving all three inputs of sex, class and weapon into one Ineteger to be
        // input into the Hashmap.
        Integer input = (sexInput * 100) + (classInput * 10) + weaponInput;

        if (name.equals("DRAGON")) {
            System.out.println("rawr");
        }

        // ====================================================================================================================
        userCharacter.setCharacter(name, input);
        Player.put(name, input);
        FancyPrint.setDelay("You are a " + userCharacter.getGender() + " " + userCharacter.getRole() + " wielding a "
                + userCharacter.getWeapon(), 10, true);

        // ====================================================================================================================
        FileInterface.writeRecordHasMap(Player, "UserCharacter.txt");
        FancyPrint.setDelay("Selected and Saved :)", 20, true);
        Main.sleep(2000);
        return userCharacter;
    }
}