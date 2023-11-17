/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import controller.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLoginPage extends JFrame{
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public MenuLoginPage(){
        setTitle("Login");
        setSize(320, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        add(panel);
        
        placeComponents(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 20, 80, 25);
        panel.add(emailLabel);
        emailField = new JTextField(20);
        emailField.setBounds(100, 20, 165, 25);
        panel.add(emailField);
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(160, 110, 80, 25);
        panel.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                String emailCheck = MenuLoginController.authenticateEmail(email, password);
                if (emailCheck != null) {
                    JOptionPane.showMessageDialog(MenuLoginPage.this, "Welcome!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    if ("Match".equals(emailCheck)) {
                        new MenuGameListPage(email);
                        dispose();
                    } 
                } else {
                    JOptionPane.showMessageDialog(MenuLoginPage.this, "Invalid email or password.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
    }
    
}