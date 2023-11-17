/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controller.MenuGameListController;

public class MenuGameListPage extends JFrame {
    private JTable gamesTable;

    public MenuGameListPage(String email) {

        setTitle("Game List");
        setSize(365, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel, email);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void placeComponents(JPanel panel, String email) {
        panel.setLayout(null);

        JButton transactionsButton = new JButton("Transactions");
        transactionsButton.addActionListener(e -> {
            new MenuTransactionPage(email, this);
            this.dispose();
        });

        add(transactionsButton, BorderLayout.NORTH);
        gamesTable = new JTable();
        panel.add(new JScrollPane(gamesTable), BorderLayout.CENTER);
        new MenuGameListController(gamesTable).fetchGamesData();

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(50, 160, 250, 35);
        panel.add(logoutButton);
        logoutButton.addActionListener(e -> {
            Object[] options = {"No", "Yes"};
            int response = JOptionPane.showOptionDialog(MenuGameListPage.this,
                    "Are you sure you want to logout?", "Logout",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[1]);

            if (response == 1) {
                new MenuLoginPage();
                dispose();
            }
        });

    }
}
