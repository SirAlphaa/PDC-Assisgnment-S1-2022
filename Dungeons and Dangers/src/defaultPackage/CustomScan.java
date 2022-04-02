import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScan {

    public static int scanInt(){
        boolean loopyBoi = true;
        int returnInt = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (loopyBoi) {
            try {
                input = sc.nextLine();
                if (input.trim().equalsIgnoreCase("quit")) {
                    //TODO: add Quit method here
                    System.out.print("Run Quit Method");
                    System.exit(0);
                }
                returnInt = Integer.parseInt(input);
                loopyBoi = false;

            } catch (InputMismatchException e) {
                FancyPrint.newLine();
                FancyPrint.setDelay("Please input a number only", 30, true);
                FancyPrint.userInputArea();
            } catch (NumberFormatException e) {
                FancyPrint.newLine();
                FancyPrint.setDelay("Please input a number only", 30, true);
                FancyPrint.userInputArea();
            }
        }
        loopyBoi = true;
        sc.close();
        return returnInt;
    }

    public static int scanIntBetween(int low, int high) {
        int returnInt = 1234567890;
        while (returnInt == 1234567890) {
            returnInt = scanInt();
            if ((returnInt <= low)||(returnInt >= high)) {
                FancyPrint.setDelay("Please input a vaild number", 30);
                returnInt = 1234567890;
                FancyPrint.userInputArea();
            }
        }
        return returnInt;
    }
}
