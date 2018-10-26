import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import java.io.*;


public class EdgeFieldTest{

    EdgeField fields = new EdgeField(
            "Figure 7" +
            "{" +
            "Style 'Attribute' " +
            "Text 'StudentSSN' " +
            "Bounds 128,576,384,640" +
            "FillColor 255,255,255" +
            "BorderWidth 2" +
            "TextFormat 0x0022" +
            "Behavior 0x000003F001024E12" +
            "Symbol 'ER attribute' " +
            "TypeSize 8" +
            "TypeFace 'Arial' " +
            "FillType 1" +
            "FillColorSolid 255,255,255" +
            "}"
        );

    @Before
    public void setUp()
    {
       String[] strDataType = {"VARCHAR", "BOOL", "INT", "DOUBLE"};
    }

    @Test
    public void testNumFigure(){
        fields.getNumFigure();
        assertEquals("7",fields.getNumFigure());
    }
    
    @Test
    public void testGetName(){
        fields.getName();
        assertEquals("StudentSSN",fields.getName());
    }
    
    @Test
    public void testSetTableID(){
        fields.setTableID(1);
        assertEquals(1,fields.getTableID());
    }
    
    @Test
    public void testSetDisallowNull(){
        fields.setDisallowNull(true);
        assertEquals(true,fields.getDisallowNull());
    }
    
    @Test
    public void testSetIsPrimaryKey(){
        fields.setIsPrimaryKey(true);
        assertEquals(true,fields.getIsPrimaryKey());
    }
     @Test
    public void testSetDefaultValue(){
        fields.setDefaultValue("1234567890123456");
        assertEquals("1234567890123456",fields.getDefaultValue());
    }

    @Test
    public void testSetVarcharValue(){
        fields.setVarcharValue(16);
        assertEquals(16,fields.getVarcharValue());
    }
    
    @Test
    public void testDataType(){
        fields.setDataType(1);
        assertEquals(1,fields.getDataType());
    
        assertEquals("VARCHAR",EdgeField.getStrDataType());
    }
    
    @Test
    public void testToString(){
        assertEquals("7|StudentSSN|1|1|16|true|true|1234567890123456",fields.toString());
    }
    
}

// Run test in terminal
// javac -cp .:junit-4.12.jar EdgeFieldTest.java
// javac EdgeField.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeFieldTest