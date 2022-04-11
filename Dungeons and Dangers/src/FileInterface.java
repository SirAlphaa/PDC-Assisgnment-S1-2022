import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileInterface 
{

    public static String[] readRecordsString(String fileName, String key) {
        String[] returnMe = {};
        String line; 
        BufferedReader br;
        boolean loopyBoi = false;
        
        try {
            br = new BufferedReader(new FileReader("./Dungeons and Dangers/resourses/" + fileName));
            while ((line = br.readLine()) != null) 
            {
                if (loopyBoi) 
                {
                    returnMe = addElement(returnMe, line);
                }
                if (line.equalsIgnoreCase(key)) 
                { 
                    loopyBoi = true; 
                }
                if (line.equalsIgnoreCase("")) 
                { 
                    loopyBoi = false;
                }
            }
        } catch (FileNotFoundException e) 
        {
            System.out.println("File Not Found");
        } catch (IOException e) 
        {
            System.out.println("IO Exception");
        }
        
        return returnMe;
    }

    public static String[] addElement(String inputArr[], String inputStr) 
    {
        String newarr[] = new String[(inputArr.length) + 1];
        for (int i = 0; i < newarr.length - 1; i++) 
        {
            newarr[i] = inputArr[i];
        }
        newarr[inputArr.length] = inputStr;
        return newarr;
    }

    public static HashMap<String, Integer> readRecordHashMap(HashMap<String, Integer> hashMap, String fileName) 
    {
        boolean loopyBoi = false;
        BufferedReader br;
        String line;
        // HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        loopyBoi = true;
        try 
        {
            br = new BufferedReader(new FileReader("./Dungeons and Dangers/resourses/" + fileName));
            while (loopyBoi) {
                if ((line = br.readLine()) != null) 
                {
                    String[] a = line.split(" ");
                    hashMap.put(a[0], Integer.parseInt(a[1]));
                } 
                else if (((line = br.readLine()) == null) || (line = br.readLine()) == " ") 
                {
                    loopyBoi = false;
                }
            }
        } catch (FileNotFoundException e) 
        {
            System.out.println("File Not Found");
        } catch (IOException e) 
        {
            System.out.println("IO Exception");
        }
        return hashMap;
    }
}