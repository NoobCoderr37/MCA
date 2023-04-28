package RegistrationForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JLabel nameLabel, emailLabel, passwordLabel;
    private JTextField nameField, emailField, passwordField;
    private JButton submitButton;

    public RegistrationForm() {
        // Set up the JFrame
        setTitle("Registration Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the components
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JTextField(20);
        submitButton = new JButton("Submit");

        // Add the components to the JFrame
        setLayout(new GridLayout(4, 2));
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel(""));
        add(submitButton);

        // Add an ActionListener to the submit button
        submitButton.addActionListener(this);

        // Show the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle the form submission
        String name = nameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        // Do something with the user's information
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}