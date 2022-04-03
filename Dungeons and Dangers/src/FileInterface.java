import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.LongUnaryOperator;

public class FileInterface {

    public static String[] readRecordsString(String fileName, String key){
        String[] returnMe = {};
        String line; 
        BufferedReader br;
        boolean loopyBoi = false;
        
        try {
            br = new BufferedReader(new FileReader("./Dungeons and Dangers/resourses/creditsInfo.txt"));
            while ((line = br.readLine()) != null) {
                if (loopyBoi) {
                    returnMe = addElement(returnMe, line);
                }
                if (line.equalsIgnoreCase(key)) { loopyBoi = true; }
                if (line.equalsIgnoreCase("")) { loopyBoi = false;}
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        
        return returnMe;
    }

    public static String[] addElement(String inputArr[], String inputStr) {
        String newarr[] = new String[(inputArr.length) + 1];
        for (int i = 0; i < newarr.length - 1; i++) {
            newarr[i] = inputArr[i];
        }
        newarr[inputArr.length] = inputStr;
        return newarr;
    }

}