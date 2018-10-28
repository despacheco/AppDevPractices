import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;

public class EdgeTableTest{

    EdgeTable tableTest = new EdgeTable("1|Table");

   	@Test
   public void evaluateNumFigure(){

      assertEquals("Figure number is: ",1, tableTest.getNumFigure());

   }

   @Test
   public void evaluateName(){
        assertEquals("Table Name is: ","Table", tableTest.getName());
   }

   @Test
   public void evaluateAddRelatedTable(){
       tableTest.addRelatedTable(1);
       tableTest.makeArrays();
        
       int[] list = new int[1];
       list[0] = 1;
        
       assertArrayEquals("Related Table is: ",list,tableTest.getRelatedTablesArray());

   }

    @Test
       public void evaluateAddNativeField(){
        tableTest.addNativeField(1);
        tableTest.makeArrays();
        
        int[] list = new int[1];
        list[0] = 1;
        
         assertArrayEquals("Native Field is: ",list, tableTest.getNativeFieldsArray());

    }

    @Test
    public void evaluateRelatedFields(){
        tableTest.addNativeField(1);
        tableTest.makeArrays();
        int[] list = new int[1];
        list[0] = 0;

        assertArrayEquals("Related Field is: ",list,tableTest.getRelatedFieldsArray());
    }

    @Test
    public void evaluateSetRelatedFields(){
         tableTest.addNativeField(1);
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
