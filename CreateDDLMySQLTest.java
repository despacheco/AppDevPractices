import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

import org.junit.Before;
import org.junit.After;


public class CreateDDLMySQLTest 
{  

   File courses = new File("Courses.edg");
   EdgeConvertFileParser parsedFile = new EdgeConvertFileParser(courses);
   CreateDDLMySQL test1 = new CreateDDLMySQL(parsedFile.getEdgeTables(), parsedFile.getEdgeFields());
      
   @Test
   public void testConvertStrBooleanToInt(){
       assertEquals("Convert Str Boolen should be true", 1,test1.convertStrBooleanToInt("true"));
   }

   @Test
   public void testGenerateDatabaseName(){
       assertEquals("Generated DB should be: ","MySQLDB",test1.generateDatabaseName());
   }

   @Test
   public void testGetDatabaseName(){
       assertEquals("DB name should be: ", "MySQLDB", test1.getDatabaseName());
       //this test failed
   }

   @Test
   public void testGetProductName(){
       assertEquals("MySQL", test1.getProductName());
   }

   @Test
   public void testGetSQLString(){
       System.out.println(test1.getSQLString());
   }
}

// Run test in terminal
// javac -cp .:junit-4.12.jar CreateDDLMySQLTest.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CreateDDLMySQLTest