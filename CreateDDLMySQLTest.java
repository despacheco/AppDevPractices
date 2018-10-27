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
<<<<<<< HEAD
   public void evaluateCreatedDDL()
   {
      test1.createDDL();
      String actual = test1.getDatabaseName();
      String expected = "MYSQL";
      assertEquals("Name of the database:", expected,actual);

      
   }   
=======
   public void testConvertStrBooleanToInt(String input){
       assertEquals("Convert Str Boolen should be true", 1,test1.convertStrBooleanToInt("true"));
   }

   @Test
   public void testGenerateDatabaseName(){
       assertEquals("Generated DB should be: ","MySQLDB",test1.generateDatabaseName());
   }

   @Test
   public void testGetDatabaseName(){
       assertEquals("DB name should be: ", "MySQLDB", test1.getDatabaseName());
   }

   @Test
   public void testGetProductName(){}

   @Test
   public void getSQLString(){}

   
//    @Test
//    public void evaluateCreatedDDL()
//    {
//       StringBuffer sb = new StringBuffer();
//       test1.createDDL();
//       assertEquals("Create DDL:",sb,test1.getSQLString());
//    }
	// @Test
// 	public void evaluatesExpression() 
// 	{
//       CreateDDLMySQL test1 = new CreateDDLMySQL();
// 		int actual = test1.convertStrBooleanToInt("true");
// 		int expected = 1;
// 		assertEquals(expected, actual);
// 	}
   
   
   
>>>>>>> 75e8ad4ef92013ff2347ae79e194bf08981aa3cf
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