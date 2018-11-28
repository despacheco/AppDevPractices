import java.awt.event.*;
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
   
      //Display the window
      jfHR = new JFrame();
      jfHR.setLocation(HORIZ_LOC, VERT_LOC);
      //jfHR.getContentPane().setLayout(new BorderLayout());
      jfHR.setVisible(true);
      jfHR.setSize(HORIZ_SIZE + 150, VERT_SIZE);

      
   }
   
   
   public void createGUI() {
   
      jfHR = new JFrame("Define Relations");
      jfHR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
   }

   
   
   


}