import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import org.junit.rules.TemporaryFolder;
import org.junit.Test;
import org.junit.Rule;
import java.io.*;
import java.net.URL;

public class EdgeConvertFileParserTest
{
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();
    public final File coursesFile = new File("Courses.edg"); 

    @Test
    public void testFileClassLoader() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File courseFile = new File(classLoader.getResource("Courses.edg").getFile());
        assertTrue(courseFile.exists());
    }

    public void testReadFileWithResource() {
        URL url = this.getClass().getResource("Courses.edg");
        File coursesFile = new File(url.getFile());
        assertTrue(coursesFile.exists());
    }

    public void testReadFileWithResource2() throws IOException {
        InputStream inStream = this.getClass().getResourceAsStream("Courses.edg");
        assertNotNull(inStream);
    }

}

// Run test in terminal
// javac -cp .:junit-4.12.jar EdgeConvertFileParserTest.java
// javac EdgeConvertFileParser.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeConvertFileParserTest