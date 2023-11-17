/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;


public class MenuGameListController {
    private JTable gamesTable;
    private Connector connector;
    
    public MenuGameListController(JTable gamesTable) {
        this.connector = Connector.getInstance();
        this.gamesTable = gamesTable;
    }
    
    public void fetchGamesData() {

        try (Connection connection = Connector.getInstance().getConnection()) {
            String query = "SELECT * FROM games";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
    }
}
