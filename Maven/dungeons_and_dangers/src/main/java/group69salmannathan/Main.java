package group69salmannathan;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserCharacter userCharacter = new UserCharacter();
        int uIntInput = 0;
        
        //=== Opening Title Screen to MainMenu ====================================================
        clearScreen();
        System.out.println(new File(".").getAbsoluteFile());
        openingScreen();
        uIntInput = CustomScan.scanIntBetween(1, 3);
        //TODO: Write JFrame to the uIntInput variable.
        //=== Main Menu options ===================================================================
        clearScreen();
        switch (uIntInput) {
            case 1:
                userCharacter = CreateCharacter.createPlayer(userCharacter);
                System.out.println("Done");

                break;
            case 2:
                AssignCharacter.select(userCharacter);
                break;
            case 3:
                clearScreen();
                String[] Devs = FileInterface.readRecordsString("creditsInfo.txt", "Credits");
                String[] specialThanks = FileInterface.readRecordsString("creditsInfo.txt", "Special Thanks");
                displayCredits(Devs, "Developers");
                displayCredits(specialThanks, "Special Thanks");
                System.exit(0);
                break;

            default:
                System.out.println("x");
        }
        clearScreen();
        //=== Dungeon Start =======================================================================

        Dungeon.intoTheDungeon(userCharacter);

        //=== Ending ===============================================================================

        FancyPrint.setDelay("Thank you for playing Dungeon and Dangers", 30, true);
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.exit(0);

    }

    /**
     * This method holds the opening screen text
     */
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

    /**
     * This method clears the console screen
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * This method makes the program wait
     * @param n input wait time in milliseconds
     */
    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }

    /**
     * Give some Credits to the devs
     * @param array The array that holds the strings
     * @param name The name of the array
     */
    public static void displayCredits(String[] array, String name) {
        FancyPrint.setDelay(name, 30, true);
        for (int i = 0; i < array.length; i++) {
            FancyPrint.setDelay(array[i], 30, true);
        }
        FancyPrint.newLine();
    }
}

//=== This is for testing purposes only ===========================================================

// int test;
// userCharacter.setCharacter("Testman", 213);
// for (int i = 0; i < 10; i++) {
//     test = userCharacter.attack();
//     System.out.print(" " + test + " ");
// }

// Enemy enemy = new Enemy();
// userCharacter.setCharacter("Testman", 223);
// Battle.start(userCharacter, 1);

// System.out.print(Arrays.toString(Devs));
// System.out.print(Arrays.toString(specialThanks));