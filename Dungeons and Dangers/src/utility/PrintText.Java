public class PrintText() {
    
    public static void oneByOne(String text, int interval) {
        char[] textArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textArray[i] = text.charAt(i);
        }
        for (char c : textArray) {
            System.out.print(c);
            sleep(interval);
        }
    }

    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}