import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class EdgeConvertFileParserTest 
{
	File courses = new File("Courses.edg"); 
	@Test
	public void evaluatesFile() 
	{
		EdgeConvertFileParser test1 = new EdgeConvertFileParser(courses);
		//File edgeFile = test1.openFile(courses);
		//assertEquals("Courses.edg",edgeFile);
	}
}

// Run test in terminal
// javac -cp .:junit-4.12.jar EdgeConvertFileParserTest.java
// javac EdgeConvertFileParser.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeConvertFileParserTest