import org.junit.Test;
import java.io.*;


public class EdgeFieldTest{
    @Test
    public void FiledsTest() {

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

        fields.getNumFigure();
        fields.getName();

        fields.setTableID(1);
        fields.getTableID();

        fields.setTableBound(416,480,672,544);
        fields.getTableBound();

        fields.setFieldBound(128,576,384,640);
        fields.getFieldBound();

        fields.setDisallowNull(false);
        fields.getDisallowNull();

        fields.setIsPrimaryKey(true);
        fields.getIsPrimaryKey(); 

        fields.setDefaultValue(StudentSSN);
        fields.getDefaultValue();

        fields.setVarcharValue(int value);
        fields.getVarcharValue();

        fields.setDataType(1);
        fields.getDataType();

        fields.getStrDataType();
        fields.toString();
    }
}