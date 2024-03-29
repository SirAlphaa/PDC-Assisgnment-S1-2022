package group69salmannathan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class FileInterface {

    /**
     * Reads a text file
     * @param fileName input the file name EG filename.txt
     * @param key the line of the text file the method will start reading from
     * @return a string array
     */

    static String filePath = "dungeons_and_dangers/src/main/resources/";

    public static String[] readRecordsString(String fileName, String key) {
        String[] returnMe = {};
        String line;
        BufferedReader br;
        boolean loopyBoi = false;

        try {
            br = new BufferedReader(new FileReader(filePath + fileName));
            while ((line = br.readLine()) != null) {
                if (loopyBoi) {
                    returnMe = addElement(returnMe, line);
                }
                if (line.equalsIgnoreCase(key)) {
                    loopyBoi = true;
                }
                if (line.equalsIgnoreCase("")) {
                    loopyBoi = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

        return returnMe;
    }

    /**
     * Adds an element to a string array
     * @param inputArr The array that will get a new element
     * @param inputStr the element to be inputted
     * @return the string array
     */
    public static String[] addElement(String inputArr[], String inputStr) {
        String newarr[] = new String[(inputArr.length) + 1];
        for (int i = 0; i < newarr.length - 1; i++) {
            newarr[i] = inputArr[i];
        }
        newarr[inputArr.length] = inputStr;
        return newarr;
    }

    /**
     * Reads a text file
     * @param hashMap input the hashmap that will be used
     * @param fileName the file that will be read EG filename.txt
     * @return the filled hashmap
     */
    public static HashMap<String, Integer> readRecordHashMap(HashMap<String, Integer> hashMap, String fileName) {
        boolean loopyBoi = false;
        BufferedReader br;
        String line;
        // HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        loopyBoi = true;
        try {
            br = new BufferedReader(new FileReader(filePath + fileName));
            while (loopyBoi) {
                if ((line = br.readLine()) != null) {
                    String[] a = line.split(" ");
                    hashMap.put(a[0], Integer.parseInt(a[1]));
                } else if (((line = br.readLine()) == null) || (line = br.readLine()) == " ") {
                    loopyBoi = false;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return hashMap;
    }

    /**
     * Write a hashmap to a file
     * @param hashMap the hashmap that will be written into a file
     * @param fileName the file name EG Filename.txt
     */
    public static void writeRecordHasMap(HashMap<String, Integer> hashMap, String fileName) {

        PrintWriter output = null;
        try {
            output = new PrintWriter(filePath + fileName);
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                output.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}

//=== This is for testing purposes only ===========================================================
// public static void writeRecords(HashMap<String, Integer> records) {
//     PrintWriter output = null;
//     try {
//         output = new PrintWriter("./resources/T02_scores.txt");
//         for (Map.Entry<String, Integer> entry : records.entrySet()) {
//             output.println(entry.getKey() + " " + entry.getValue());;
//         }
    // } catch (FileNotFoundException e) {
    //     System.out.println("File not found");
    // } finally {
    //     if (output != null) {
    //         output.close();
    //     }
//     }
// }