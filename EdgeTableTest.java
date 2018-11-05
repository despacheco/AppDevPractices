import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class EdgeTableTest{

    private int numFig;
    private String name;
    private String test;
    private int field;

    public EdgeTableTest(int numFig, String name){

        this.numFig = numFig;
        this.name = name;
        this.test = numFig+"|"+name;
        this.field = 1;
        
    }

    EdgeTable tableTest = new EdgeTable(this.test);

   	@Test
   public void evaluateNumFigure(){

      assertEquals("Figure number is: ",this.numFig, tableTest.getNumFigure());

   }

   @Test
   public void evaluateName(){
        assertEquals("Table Name is: ",this.name, tableTest.getName());
   }

   @Test
   public void evaluateAddRelatedTable(){
       tableTest.addRelatedTable(this.field);
       tableTest.makeArrays();
        
       int[] list = new int[1];
       list[0] = this.field;
        
       assertArrayEquals("Related Table is: ",list,tableTest.getRelatedTablesArray());

   }

    @Test
       public void evaluateAddNativeField(){
        tableTest.addNativeField(this.field);
        tableTest.makeArrays();
        
        int[] list = new int[1];
        list[0] = this.field;
        
         assertArrayEquals("Native Field is: ",list, tableTest.getNativeFieldsArray());

    }

    @Test
    public void evaluateRelatedFields(){
        tableTest.addNativeField(this.field);
        tableTest.makeArrays();
        int[] list = new int[1];
        list[0] = 0;

        assertArrayEquals("Related Field is: ",list,tableTest.getRelatedFieldsArray());
    }

    @Test
    public void evaluateSetRelatedFields(){
         tableTest.addNativeField(this.field);
         tableTest.makeArrays();
         tableTest.setRelatedField(0, 1);
         int[] list = new int[1];
         list[0] = 1;

         assertArrayEquals("Related Field is: ",list,tableTest.getRelatedFieldsArray());
     }

}

// Run test in terminal
// javac -cp .:junit-4.12.jar EdgeTableTest.java
// javac EdgeTable.java
// java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar \org.junit.runner.JUnitCore EdgeTableTest
