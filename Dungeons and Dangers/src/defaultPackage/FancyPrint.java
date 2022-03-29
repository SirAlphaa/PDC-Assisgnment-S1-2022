public class FancyPrint {

    // This method prints the inputed string char by char with a delay set by the interval
    public static void setDelay(String text, int interval) {
        char[] textArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textArray[i] = text.charAt(i);
        }
        for (char c : textArray) {
            System.out.print(c);
            sleep(interval);
        }
    }

    // This method is the same as above using the "Method Overload" method 
    // This can create an optional New Line, if third Arugemt is True the method will print a new line at the end. 
    public static void setDelay(String text, int interval, boolean newLine) {
        char[] textArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textArray[i] = text.charAt(i);
        }
        for (char c : textArray) {
            System.out.print(c);
            sleep(interval);
        }
        if (newLine) {
            System.out.print("\n");
        }
    }

    public static void userInputArea() {
        System.out.print("\n -> ");
    }

    //This method takes in just a string and prints it like normal
    public static void normal(String str) {
        System.out.print(str);
    }

    //Just prints out a new line lol
    public static void newLine() {
        System.out.println("");
    }

    //sleep function for the delay print methods 
    private static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}
