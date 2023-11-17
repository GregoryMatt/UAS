/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grego
 */
public class Games {
    private int id;
    private String name;
    private String genre;
    private int prive;

    public Games(int id, String name, String genre, int prive) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.prive = prive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrive() {
        return prive;
    }

    public void setPrive(int prive) {
        this.prive = prive;
    }
    
    
}
