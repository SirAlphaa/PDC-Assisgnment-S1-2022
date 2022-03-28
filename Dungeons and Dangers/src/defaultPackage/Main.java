
public class Main {
    
    public static void main(String[] args) {
    
        //= Opening Title Screen to MainMenu ======================================================
        System.out.print("Loading, please wait");
        SlowPrint.setDelay(".....", 700, true);
        SlowPrint.setDelay("Done!", 40);
        sleep(500);
        clearScreen();
        SlowPrint.setDelay("=================================", 20, true);
        SlowPrint.setDelay("*           Welcome to          *", 30, true);
        SlowPrint.setDelay("*    Dungeons and Dangers!!!    *", 30, true);
        SlowPrint.setDelay("=================================", 20, true);
        SlowPrint.setDelay(" Main Menu", 30, true);


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