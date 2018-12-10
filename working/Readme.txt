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