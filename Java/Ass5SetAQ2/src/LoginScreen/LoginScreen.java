package LoginScreen;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginScreen extends JFrame implements ActionListener{
JLabel l1,l2;
JTextField tf1;
JPasswordField pf;
JButton login;

LoginScreen(){
l1=new JLabel("User Name");
l2=new JLabel("Password");
tf1=new JTextField(15);
pf=new JPasswordField(15);
login=new JButton("Login");

setLayout(new FlowLayout());
setSize(300,300);

add(l1);
add(tf1);
add(l2);
add(pf);
add(login);

login.addActionListener(this);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) {
String s=e.getActionCommand();
if(s.equals("Login")) {
if((tf1.getText().equals("Rohit"))&&(pf.getText().equals("0002")))
{
JOptionPane.showMessageDialog(this,"Login Successful",
"VALID",JOptionPane.INFORMATION_MESSAGE);
}
else
JOptionPane.showMessageDialog(this,"Invalid username or password,please re-enter",
"ERROR",JOptionPane.ERROR_MESSAGE);
tf1.setText("");
pf.setText("");
}
}
public static void main(String[] args) {
new LoginScreen();

}


}



















/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginScreen extends JFrame implements ActionListener {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public LoginScreen() {
        setTitle("Login Screen");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        userField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);

        add(panel, BorderLayout.CENTER);

        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userField.getText();
            String password = new String(passwordField.getPassword());

            // Check if the username and password are correct
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        } else if (e.getSource() == cancelButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LoginScreen();
    }
}


*/