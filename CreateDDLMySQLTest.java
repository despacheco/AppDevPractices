import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CreateDDLMySQLTest 
{  
   EdgeTable table1 = new EdgeTable("1|STUDENT");
   EdgeTable table2 = new EdgeTable("2|FACULTY");
   EdgeTable table3 = new EdgeTable("13|COURSES");
   EdgeTable [] tables = {table1,table2,table3};

   EdgeField field1 = new EdgeField("3|Grade");
   EdgeField field2 = new EdgeField("4|CourseName");
   EdgeField [] fields = {field1,field2};
   CreateDDLMySQL test1 = new CreateDDLMySQL(tables,fields);
   
   @Before
   public void init()
   {

   }
   
   @Test
   public void evaluateCreatedDDL()
   {
      test1.createDDL();
      String actual = test1.getDatabaseName();
      String expected = "MYSQL";
      assertEquals("Name of the database:", expected,actual);

      
   }   
   // @Test
//    public void evaluateGenerateDatabaseName()
//    {
//      String actual  = test1.generateDatabaseName();
//      String expected = "MySQLDB";
//      assertEquals("Name of the database:","hello",databaseName);
//    }
}

// Run test in terminal
// javac -cp .:junit-4.12.jar CreateDDLMySQLTest.java
// javac CreateDDLMySQL.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore CreateDDLMySQLTest