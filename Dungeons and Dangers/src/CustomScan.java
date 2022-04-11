import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScan {

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
}

