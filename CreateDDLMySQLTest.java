import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CreateDDLMySQLTest 
{
	@Test
	public void evaluatesExpression() 
	{
		CreateDDLMySQL test1 = new CreateDDLMySQL();
		int message = test1.convertStrBooleanToInt("true");
		
		assertEquals(0,message);
	}
}

// Run test in terminal
// javac -cp .:junit-4.12.jar CreateDDLMySQLTest.java
// javac CreateDDLMySQL.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore CreateDDLMySQLTest