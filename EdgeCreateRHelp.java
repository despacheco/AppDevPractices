import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class EdgeCreateRHelp {
   
   
   public static final int HORIZ_SIZE = 435;
   public static final int VERT_SIZE = 400;
   public static final int HORIZ_LOC = 100;
   public static final int VERT_LOC = 100;

   
   static JFrame jfHR;
   
   
   public EdgeCreateRHelp(){
      showGUI();
   
   }
   
   public void showGUI() {
    
         
      // create a jtextarea
      JTextArea textArea = new JTextArea();
      
      textArea.setText("Define Relations\n" + "\n" +

                  "There are three Options with the Define Relations Section: Bind/Unbind, Define Tables, and Create DDL\n" + "\n" +

                  "Option 1: Bind/Unbind\n" + 
                     "\tPart 1: Unbinding\n" +
                        "\t\tStep 1: Select two fields that are related.\n" + 
                        "\t\tStep 2: Select the Bind/Unbind button\n" +
                        "\t\tStep 3: A pop-up box will appear asking if you wish to unbind the selected fileds.\n" + 
                              "\t\t\t3.a: If you say yes, another pop-up box will appear asking if you are sure.\n" +
                                 "\t\t\t\t3.a1: If you say no, the relation will not be unbound, and the pop-up box will close.\n" + "\n" + 

                              "\t\t\t3.b: If you say yes, the relation will be unbound.\n" +
                                 "\t\t\t\t3.b1: If you say no, the relation will not be unbound.\n" + "\n" +
                              
                     "\tPart 2: Binding\n" +
                        "\t\tStep 1: Select two fields or tables that are related.\n" + 
                        "\t\tStep 2: Select the Bind/Unbind button\n" +
                        "\t\tStep 3: A pop-up box will appear that says you have bound your desired fields.\n" +
                              "\t\t\t3.a: If the fields you have selected to bind have datatypes that do not match,\n" + 
                                 "\t\t\t\tyou wil not be able to bind those fields.\n" + 
                                 "\t\t\t\tA pop-up box will appear stating that the fields datatypes do not match.\n" + 

                              "\t\t\t3.b: If the fields you have selected to bind have varchars that do not match,\n" + 
                                 "\t\t\t\tyou wil not be able to bind those fields.\n" + 
                                 "\t\t\t\tA pop-up box will appear stating that the fields varchars do not match.\n" + "\n" + "\n" + 
                                 

                  "Option 2: Define Tables\n" +
                     "\tStep 1: Select the Define Tables option.\n" +
                        "\t\tOnce this option is selected the screen will change to the Define Tables screen.\n" +
                        "\t\tOn this screen you have the ability to set all the required information for the a table.\n" + "\n" +

                     "\tStep 2: Set the Datatype by selecting one of the radio buttons (varchar, int, boolean,or double).\n" +
                        "\t\t2.a: If you select the datatype varchar,the button for setting your varchar length will become available.\n" +
                              "\t\t\t2.a1: Select the button called 'Set Varchar Length'\n" +
                              "\t\t\t2.a2: A pop-up box will appear asking you to enter a length for the varchar.\n" + 
                                 "\t\t\t\tOnce you enter the varchar length, click OK.\n" + 
                     "\tStep 3: Set or unset Disallow Null by clciking on the checkbox labled 'Disallow Null'.\n" +
                     "\tStep 4: Set or unset the Primary key by clciking on the checkbox labled 'Primary Key'.\n" +
                     "\tStep 5: Set the Default Value by clciking on the button that says 'Set Default Value'.\n" +
                              "\t\t\tA pop-up window will appear for you to enter your default value. Once you have entered your value,\n" +
                              "\t\t\tclick OK.\n" + "\n" + "\n" +


                  "Option 3: Create DDL\n" +
                     "\tStep 1: Click the Create DDL button.\n" +
                        "\t\tThis will create a DDL for the current file you are working in."); 
   
      
      JScrollPane scrollPane = new JScrollPane(textArea);
            
      //Display the window
      jfHR = new JFrame();
      jfHR.getContentPane().add(scrollPane, BorderLayout.CENTER);
      jfHR.setLocation(HORIZ_LOC, VERT_LOC);
      jfHR.setVisible(true);
      jfHR.setSize(HORIZ_SIZE + 150, VERT_SIZE);

      
   }
   
   
   public void createGUI() {
   
      jfHR = new JFrame("Define Relations");
      jfHR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   }

   
   
   


}