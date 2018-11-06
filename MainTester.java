import java.util.Scanner;
import org.junit.runner.*;

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
                }
                else {
                    //TODO: Provide a default test object
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
                    //TODO: Provide a default test file
                    String testObjectFile = "Data.txt";
                    parseFile(testObjectFile);
                }
            }
        }

        Result result = runClasses(EdgeFieldTest(), EdgeFieldTable());
        System.out.println(result);
    }

    //Function to read test file
    public static void parseFile(String testObjectFile) {
        Scanner read = new Scanner (new File(testObjectFile));
        read.useDelimiter("|");
        int fieldNum, tableNum;
        String fieldName, tableName;

        while(read.hasNext()) {
            tableNum = read.next();
            tableName = read.next();
            fieldNum = read.next(); 
            fieldName = read.next();

            if(tableNum == 0 && !tableName.isEmpty()) {
                EdgeFieldTest();

            }

            if(fieldNum == 0 && !fieldName.isEmpty()) {
                EdgeTableTest(tableNum+"|"+tableName+"|"+fieldNum+"|"+fieldName);
            }
        }
    }

    //BEGIN TESTS
    public static Result runClasses(Class<?>... classes) {
        return new JUnitCore().run(classes);
    }

}