import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.io.*;


public class EdgeFieldTest{

    EdgeField fields = new EdgeField("7|Student");

    @Before
    public void setUp()
    {
       String[] strDataType = {"VARCHAR", "BOOL", "INT", "DOUBLE"};
    }

    @Test
    public void testNumFigure(){
        fields.getNumFigure();
        assertEquals("Figure Number should be: ",7,fields.getNumFigure());
    }
    
    @Test
    public void testGetName(){
        assertEquals("Name should be: ","Student",fields.getName());
    }
    
    @Test
    public void testSetTableID(){
        fields.setTableID(1);
        assertEquals("Table ID should be: ",1,fields.getTableID());
    }
    
    @Test
    public void testSetDisallowNull(){
        fields.setDisallowNull(true);
        assertEquals("Disallow null should be: ",true,fields.getDisallowNull());
    }
    
    @Test
    public void testSetIsPrimaryKey(){
        fields.setIsPrimaryKey(true);
        assertEquals("Primary key should be: ",true,fields.getIsPrimaryKey());
    }
     @Test
    public void testSetDefaultValue(){
        fields.setDefaultValue("1234567890123456");
        assertEquals("Default value should be set to: ","1234567890123456",fields.getDefaultValue());
    }

    @Test
    public void testSetVarcharValue(){
        fields.setVarcharValue(16);
        assertEquals("Varchar value should be: ",16,fields.getVarcharValue());
    }
    
    @Test
    public void testDataType(){
        fields.setDataType(1);
        assertEquals("Data Type should be: ",1,fields.getDataType());
    }
}

// Run test in terminal
// javac -cp .:junit-4.12.jar EdgeFieldTest.java
// javac EdgeField.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeFieldTest