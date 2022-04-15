import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScan {

    /**
     * Scans the console for a Int
     * @return the user inputted int
     */
    public static int scanInt(){
        boolean loopyBoi = true;
        int returnInt = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        FancyPrint.newLine();
        while (loopyBoi) {
            try {
                FancyPrint.userInputArea();
                input = sc.nextLine();
                if (input.trim().equalsIgnoreCase("quit")) {
                    //TODO: add Quit method here
                    System.out.print("Run Quit Method");
                    System.exit(0);
                }
                returnInt = Integer.parseInt(input);
                loopyBoi = false;

            } catch (InputMismatchException e) {
                FancyPrint.setDelay("inputMismatchexception", 20, true);
            } catch (NumberFormatException e) {
                FancyPrint.setDelay("Please input a number only", 20, true);
            }
        }
        return returnInt;
    }

    /**
     * Scans the console for a Int
     * @param low The lowest value that is allowed
     * @param high The highest value that is allowed
     * @return the user inputted int
     */
    public static int scanIntBetween(int low, int high) {
        boolean loopyBoi = true;
        int returnInt = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        FancyPrint.newLine();
        while (loopyBoi) {
            try {
                FancyPrint.userInputArea();
                input = sc.nextLine();
                if (input.trim().equalsIgnoreCase("quit")) {
                    //TODO: add Quit method here
                    System.out.print("Run Quit Method");
                    System.exit(0);
                }
                returnInt = Integer.parseInt(input);
                if ((returnInt >= low)&&(returnInt <= high)) {
                    loopyBoi = false;
                } else {
                    FancyPrint.setDelay("Please input a vaild number", 30, true);
                }

            } catch (InputMismatchException e) {
                FancyPrint.setDelay("inputMismatchexception", 20, true);
            } catch (NumberFormatException e) {
                FancyPrint.setDelay("Please input a number only", 20, true);
            }
        }
        return returnInt;
    }

    /**
     * Scans the console for the user Inputted string
     * @return returns the user inputted string
     */
    public static String scanString(){
        boolean loopyBoi = true;
        String returnString = "";
        String input = "";
        Scanner sc = new Scanner(System.in);
        FancyPrint.newLine();
        while (loopyBoi) {
            try {
                FancyPrint.userInputArea();
                input = sc.nextLine();
                if (input.trim().equalsIgnoreCase("quit")) {
                    //TODO: add Quit method here
                    System.out.print("Run Quit Method");
                    System.exit(0);
                } else if (input.trim().equalsIgnoreCase("")) {
                    throw new NumberFormatException();
                }
                returnString = input;
                loopyBoi = false;

            } catch (InputMismatchException e) {
                FancyPrint.setDelay("inputMismatchexception", 20, true);
            } catch (NumberFormatException e) {
                FancyPrint.setDelay("Please input a string only", 20, true);
            }
        }
        return returnString;
    }

    /**
     * Prompts the user to press enter to continue 
     */
    public static void enterToContinue(){
        FancyPrint.setDelay("Press Enter to Continue", 20);
        Scanner sc = new Scanner(System.in);
        FancyPrint.userInputArea();
        sc.nextLine();
    }
}
