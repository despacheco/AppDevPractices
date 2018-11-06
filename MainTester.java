import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import org.junit.runner.JUnitCore;

/* File to run all of the tests */

public class MainTester {
    public static void main (String[] args) {
        int nIndex = -1;
        int fIndex = -1;
        boolean nExists = false;
        boolean fExists = false;

        //Get the index of the arguments
        for(int i = 0; i <args.length; i++) {
            if(args[i].equals("-n")) {
                nIndex = i;
                nExists = true;
                break;
            }
            if(args[i].equals("-f")) {
                fIndex = i;
                fExists = true;
                break;
            }
        }

        for (String arg: args) {
            System.out.println(arg);
            
            //-h prints a short help message on the console, telling what options are available and what they mean
            if(arg.equals("-h")) {
                System.out.println("The following options are available for this program: ");
                System.out.println("Argument [-n]: What follows is the test object of your choice.");
                System.out.println("Argument [-f]: What follows is the name of the test object file.");
            }

            //-n means that what follows is a test object
            if(arg.equals("-n")) {
                //Retrieve the object if it was provided otherwise provide a default objects
                if(nIndex != -1) {
                    String testObject = args[nIndex + 1];
                    String[] testValues = testObject.split("|");

                    int tableNum = Integer.parseInt(testValues[0]);
                    String tableName = testValues[1];
                    int fieldNum = Integer.parseInt(testValues[2]); 
                    String fieldName = testValues[3];
                }
                else {
                    //Retrieve file to get default test objects
                    parseFile("data.txt");
                }
            }

            //-f means that what follows is the name of a test object file, containing one or more test objects
            if(arg.equals("-f")) {
                //Retrieve the object if it was provided otherwise provide a default object
                if(fIndex != -1) {
                    String testObjectFile = args[fIndex + 1];
                    parseFile(testObjectFile);
                    
                }
                else {
                    String testObjectFile = "Data.txt";
                    parseFile(testObjectFile);
                }
            }
        }

        JUnitCore jUnitCore = new JUnitCore();
        
        // Result result1 = jUnitCore.run(EdgeFieldTest.class);
        // Util.printResult(result1);

        Result result2 = jUnitCore.run(EdgeTableTest.class);
        Util.printResult(result2);
    }

    //Function to read test file
    public static void parseFile(String testObjectFile) {
        Scanner read = new Scanner (new File(testObjectFile));
        read.useDelimiter("|");
        int fieldNum, tableNum;
        String fieldName, tableName;

        while(read.hasNext()) {
            tableNum = Integer.parseInt(read.next());
            tableName = read.next();
            fieldNum = Integer.parseInt(read.next()); 
            fieldName = read.next();

            if(fieldNum == 0 && !fieldName.isEmpty()) {
                EdgeTableTest(tableNum+"|"+tableName+"|"+fieldNum+"|"+fieldName);
            }
        }
    }

}