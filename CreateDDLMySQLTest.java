import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CreateDDLMySQLTest 
{
   private CreateDDLMySQL test1 = new CreateDDLMySQL();
   
   @Before
   public void init()
   {
      String[] strDataType = {"VARCHAR", "BOOL", "INT", "DOUBLE"};
   }
   
   @Test
   public void evaluateCreatedDDL()
   {
      StringBuffer sb = new StringBuffer();
      test1.createDDL();
      sb.append("hello");
      assertEquals("Create DDL:",sb,test1.getSQLString());
   }
	@Test
	public void evaluatesExpression() 
	{
		int actual = test1.convertStrBooleanToInt("true");
		int expected = 1;
		assertEquals(expected, actual);
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