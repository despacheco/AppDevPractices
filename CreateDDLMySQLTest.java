import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CreateDDLMySQLTest 
{  
   //EdgeTable[] inputTables = new EdgeTable[5];
   //inputTables = new EdgeTable("Students|Courses");
//    inputTables.add("Student|Courses");  
//    EdgeField[] inputFields = new EdgeField[1];
   //CreateDDLMySQL test1 = new CreateDDLMySQL(inputTables,inputFields);
   CreateDDLMySQL test1 = new CreateDDLMySQL();
   @Before
   public void init()
   {
      //String[] strDataType = {"VARCHAR", "BOOL", "INT", "DOUBLE"};
      //StringBuffer sb = new StringBuffer();
      //sb.append("New");
   }
   
   @Test
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