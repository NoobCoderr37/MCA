package MenuEg;

import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuEg extends JFrame {

JMenuBar mb;
JMenu file, edit, search;
JMenuItem New, open, save;
JMenuItem cut, copy, paste;
JMenuItem find, replace;

MenuEg(){
mb=new JMenuBar();
file=new JMenu("file");
edit=new JMenu("Edit");
search=new JMenu("search");

New =new JMenuItem("New");
open =new JMenuItem("open");
save =new JMenuItem("save");
cut=new JMenuItem("Cut");
copy=new JMenuItem("Copy");
paste=new JMenuItem("Paste");
find=new JMenuItem("Find");
replace=new JMenuItem("Replace");

setJMenuBar(mb);

mb.add(file);
mb.add(edit);
mb.add(search);

file.add(New);
file.add(open);
file.add(save);

edit.add(cut);
edit.add(copy);
edit.add(paste);

search.add(find);
search.add(replace);
 
setSize(300,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
 public static void main(String[]args) {
 new MenuEg();
 }


}
















/*
import javax.swing.*;

public class MenuEg {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Menu Example");
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      JMenuItem openItem = new JMenuItem("Open");
      JMenuItem saveItem = new JMenuItem("Save");
      JMenuItem exitItem = new JMenuItem("Exit");

      // Add ActionListeners to the menu items
      openItem.addActionListener(e -> System.out.println("Open clicked"));
      saveItem.addActionListener(e -> System.out.println("Save clicked"));
      exitItem.addActionListener(e -> System.exit(0));

      // Add menu items to the file menu
      fileMenu.add(openItem);
      fileMenu.add(saveItem);
      fileMenu.addSeparator();
      fileMenu.add(exitItem);

      // Add the file menu to the menu bar
      menuBar.add(fileMenu);

      // Add the menu bar to the frame
      frame.setJMenuBar(menuBar);

      // Set the size and visibility of the frame
      frame.setSize(300, 200);
      frame.setVisible(true);
   }
}
*/
