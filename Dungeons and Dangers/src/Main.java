package utility;

public class Main {
    
    public static void main(String[] args) {
    
        //==Opening Title Screen===================================================================     
        String title = "     Dungeons and Dangers!!!";
        String titleLine = "=================================";

        PrintText.oneByOne(title, 30);
        // char[] titleArray = new char[title.length()];
        // for (int i = 0; i < title.length(); i++) {
        //     titleArray[i] = title.charAt(i);
        // }
        // char[] titleLineArray = new char[titleLine.length()];
        // for (int i = 0; i < titleLine.length(); i++) {
        //     titleLineArray[i] = titleLine.charAt(i);
        // }

        clearScreen();

        // for (char c : titleLineArray) {
        //     System.out.print(c);
        //     sleep(30);
        // }
        // System.out.println("");
        // for (char c : titleArray) {
        //     System.out.print(c);
        //     sleep(30);
        // }
        // System.out.println("");
        // for (char c : titleLineArray) {
        //     System.out.print(c);
        //     sleep(30);
        // }

        // clearScreen();
        // System.out.print("Hello");
        // sleep(1000);
        // System.out.print(" and welcome to...\n\n");
        // sleep(2000);
        // System.out.print("Dungeons ");
        // sleep(500);
        // System.out.print("and ");
        // sleep(500);
        // System.out.print("Dangers!!!");

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
