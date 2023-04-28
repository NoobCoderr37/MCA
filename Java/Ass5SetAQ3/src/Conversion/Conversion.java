package Conversion;


import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class Conversion extends JFrame implements ActionListener {
private static final long serialVersionUID = 1L;

private JLabel meterLabel, centimeterLabel;
private JTextField meterTextField, centimeterTextField;
private JButton convertButton;

public Conversion() {
    meterLabel = new JLabel("METER"); 
    centimeterLabel = new JLabel("CENTIMETER");
    meterTextField = new JTextField(15);
    centimeterTextField = new JTextField(15);
    convertButton = new JButton("CONVERT");

    setLayout(new FlowLayout());
    add(meterLabel);
    add(meterTextField);
    add(centimeterLabel);
    add(centimeterTextField);
    add(convertButton);

    convertButton.addActionListener(this);

    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) { 
    String s = e.getActionCommand();
    if(s.equals("CONVERT")) {
        int n = Integer.parseInt(meterTextField.getText());
        centimeterTextField.setText("" + n * 100);
    }
}

public static void main(String[] args) { 
    new Conversion();
}
}



























/*
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
public class Conversion extends JFrame implements ActionListener{ // label Meter and centimeter
/**
	 * 
	 
	private static final long serialVersionUID = 1L;

JLabel m, cm;

JTextField tfm, tfcm;

JButton convert;

Conversion(){
JLabel m = new JLabel("METER"); 
JLabel cm = new JLabel("CENTIMETER");
tfm = new JTextField(15);
tfcm= new JTextField(15);
JButton convert = new JButton("CONVERT");
// set Layout
setLayout(new FlowLayout());
add(m); add(tfm);
add(cm);
add(tfcm);
add(convert);
//register listener to component convert.addActionListener(this);
setSize(300,300); setVisible(true);
setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed (ActionEvent e) { 
	String s=e.getActionCommand();
if(s.equals("CONVERT")) {
int n = Integer.parseInt(tfm.getText());
tfcm.setText(""+n*100);
}
} public static void main(String[] args) { 
	new Conversion();
}
}

*/