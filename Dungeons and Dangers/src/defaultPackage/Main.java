import java.util.Scanner;

        //TODO: We are going to have to make a class to scan user inputs and check different things like if the user has inputted quit or not and what to do. 
        //TODO: Make a method that prints out Credits to us xD

public class Main {
    
    public static void main(String[] args) {
    
        Scanner uInput = new Scanner(System.in);
        
        //= Opening Title Screen to MainMenu ======================================================
        openingScren();
        FancyPrint.userInputArea();
        uInput.nextLine();


        uInput.close();
    }

    public static void openingScren() {
        clearScreen();
        System.out.print("Loading, please wait");
        FancyPrint.setDelay(".....", 700, true);
        FancyPrint.setDelay("Done!", 40);
        sleep(500);
        clearScreen();
        FancyPrint.setDelay("==========================================================================================", 10, true);
        FancyPrint.setDelay("*                                      Welcome to                                        *", 20, true);
        FancyPrint.setDelay("*                                Dungeons and Dangers!!!                                 *", 20, true);
        FancyPrint.setDelay("==========================================================================================", 10, true);
        FancyPrint.newLine();
        FancyPrint.setDelay("You can quit and save at anytime by typing 'Quit' unless told otherwise", 10, true);
        FancyPrint.newLine();
        FancyPrint.setDelay("Main Menu", 20, true);
        FancyPrint.setDelay(" (1) Character Creatation - Create your very own character!", 10, true);
        FancyPrint.setDelay(" (2) Select Exisiting Character - Select a premade character or one you made before!", 10, true);
        FancyPrint.setDelay(" (3) Credits - Give some support to the game devs", 10, true);
        FancyPrint.newLine();
        FancyPrint.setDelay("=========================================================================================", 10);
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
}