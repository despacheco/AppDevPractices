Refactoring

File that was refactored: EdgeConvertGui.java
Method that was refactored: createDTScreen()

What was done:
We noticed that there was a lot of reusable code when creating JMenuItem's. Therefore, we created two seperate methods called createJItem() and createJItemNotEnabled(). The methods are decribed below: 

   public JMenuItem createJItem(String itemStr, JMenuItem itemName, int event) {
    itemName = new JMenuItem(itemStr);
    itemName.setMnemonic(event);
    itemName.setEnabled(true);
    itemName.addActionListener(menuListener);
    return itemName;
   }
   
   public JMenuItem createJItemNotEnabled(String itemStr, JMenuItem itemName, int event) {
     itemName = new JMenuItem(itemStr);
     itemName.setMnemonic(event);
     itemName.setEnabled(false);
     itemName.addActionListener(menuListener);
     return itemName;
   }

Now, when adding JMenuItems to the GUI, we were able to simply call these methods which made the code a lot more readable:

      jmiDTOpenEdge = createJItem("Open Edge File", jmiDTOpenEdge, KeyEvent.VK_E);
      jmiDTOpenSave = createJItem("Open Save File", jmiDTOpenSave, KeyEvent.VK_V);
      jmiDTSave = createJItemNotEnabled("Save", jmiDTSave, KeyEvent.VK_S);
      jmiDTSaveAs = createJItemNotEnabled("Save As...", jmiDTSaveAs, KeyEvent.VK_A);
      jmiDTExit = createJItem("Exit", jmiDTExit, KeyEvent.VK_X);
      
      jmDTFile.add(jmiDTOpenEdge);
      jmDTFile.add(jmiDTOpenSave);
      jmDTFile.add(jmiDTSave);
      jmDTFile.add(jmiDTSaveAs);
      jmDTFile.add(jmiDTExit);


To Add Another DBMS:

Step 1: Open EdgeConvertGUI.java
Step 2: Within the createDTScreen() method search for the string "Show Database Products Available".
Step 3: change the following:
        jmiDTOptionsShowProducts.setEnabled(false); To jmiDTOptionsShowProducts.setEnabled(true);
Step 4: Within the displayProductNames() method add the following line after the instatiation of the StringBuffer:
        productNames = EdgeConvertCreateDDL.products;
Step 5: Open EdgeConvertCreateDDL.java
Step 6: Add the desired DBMS within the products arrary.
        Example: static String[] products = {"MySQL", "Oracle"};
        Here I have added the Oracle DBMS, but other DBMS can be added.

Using a Differnt Modeling Program File:

Step 1: Create a copy of EdgeConvertFileParse.java
Step 2: Refactor the above file copy to work with another DMBS file.
         Take out any specfic format that is related to the Edge Diagrammer file (Courses.edg).
         Replace the file specfic format items with the DBMS format that you will be using.
         Depending on the modeling program file you are using, you may not need some 
            of the methods within this file (ex. resolveConnectors). Or you may want to re-write this
            method to fit with the new modeling program file.
