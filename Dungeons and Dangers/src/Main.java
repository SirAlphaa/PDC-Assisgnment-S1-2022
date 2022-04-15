//TODO: We are going to have to make a class to scan user inputs and check different things like if the user has inputted quit or not and what to do. 
//TODO: Make a Quit Expection, we will make it towards the end of the project
//TODO: Make a method that prints out Credits to us xD

//TODO FOR SALMAN
//Going to make the Credits, planning on using a notepad to store our names and any usefull websites, youll see
//Make Character Creation and selection classes

//TODO FOR NATHAN
// Dungeon go ooga booga

public class Main {

    public static void main(String[] args) {
        UserCharacter userCharacter = new UserCharacter();
        int uIntInput = 0;
        String uStringInput = "";
        boolean looper = true;
        
        // Enemy enemy = new Enemy();
        // userCharacter.setCharacter("Testman", 223);
        // Battle.start(userCharacter, 1);
        
        // = Opening Title Screen to MainMenu
        // ======================================================
        clearScreen();
        //openingScreen();
        uIntInput = CustomScan.scanIntBetween(1, 3);




        // = Main Menu options
        // =====================================================================
        clearScreen();
        switch (uIntInput) {
            case 1:
                userCharacter = CreateCharacter.createPlayer(userCharacter);
                System.out.println("Done");

                break;
            case 2:
                assignCharacter.select(userCharacter);
                break;
            case 3:
                clearScreen();
                String[] Devs = FileInterface.readRecordsString("creditsInfo.txt", "Credits");
                String[] specialThanks = FileInterface.readRecordsString("creditsInfo.txt", "Special Thanks");
                displayCredits(Devs, "Developers");
                displayCredits(specialThanks, "Special Thanks");
                // System.out.print(Arrays.toString(Devs));
                // System.out.print(Arrays.toString(specialThanks));
                break;

            default:
                System.out.println("x");
                ;
        }
        clearScreen();
        //=================================================================================

        //TODO: Create the dungeon method

        //=================================================================================

        // TODO: Below is for testing only. Comment out before submission
        //clearScreen();
        //System.out.print(uIntInput);
        //userCharacter.printStats();
        System.exit(0);
    }

    public static void openingScreen() {
        System.out.print("Loading, please wait");
        FancyPrint.setDelay(".....", 700, true);
        FancyPrint.setDelay("Done!", 40);
        sleep(500);
        clearScreen();
        FancyPrint.setDelay(
                "==========================================================================================",
                10, true);
        FancyPrint.setDelay(
                "*                                      Welcome to                                        *",
                20, true);
        FancyPrint.setDelay(
                "*                                Dungeons and Dangers!!!                                 *",
                20, true);
        FancyPrint.setDelay(
                "==========================================================================================",
                10, true);
        FancyPrint.newLine();
        FancyPrint.setDelay("You can quit and save at anytime by typing 'Quit' unless told otherwise", 10,
                true);
        FancyPrint.newLine();
        FancyPrint.setDelay("Main Menu", 20, true);
        FancyPrint.setDelay(" (1) Character Creatation - Create your very own character!", 10, true);
        FancyPrint.setDelay(
                " (2) Select Exisiting Character - Select a premade character or one you made before!", 10,
                true);
        FancyPrint.setDelay(" (3) Credits - Give some support to the game devs", 10, true);
        FancyPrint.newLine();
        FancyPrint.setDelay(
                "=========================================================================================",
                10);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }

    public static void displayCredits(String[] array, String name) {
        FancyPrint.setDelay(name, 30, true);
        for (int i = 0; i < array.length; i++) {
            FancyPrint.setDelay(array[i], 30, true);
        }
        FancyPrint.newLine();
    }
}

// int test;
// userCharacter.setCharacter("Testman", 213);
// for (int i = 0; i < 10; i++) {
//     test = userCharacter.attack();
//     System.out.print(" " + test + " ");
// }

