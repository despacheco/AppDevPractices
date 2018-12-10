import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
public class EdgeCreateDBHelp 
{
   public static final int HORIZ_SIZE = 435;
   public static final int VERT_SIZE = 400;
   public static final int HORIZ_LOC = 100;
   public static final int VERT_LOC = 100;  
   static JFrame jfHDD;
   
   
   public EdgeCreateDBHelp()
   {
      showGUI();
   }
   
   public void showGUI() 
   {
      //Display the window
      jfHDD = new JFrame();
      jfHDD.setLocation(HORIZ_LOC, VERT_LOC);
      jfHDD.getContentPane().setLayout(new BorderLayout());
      jfHDD.setVisible(true);
      jfHDD.setSize(HORIZ_SIZE + 150, VERT_SIZE);   
   }
   
   
      public void createGUI() 
   {
      jfHDD = new JFrame("Create Database");
      jfHDD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
} 
