package com.project.PR44;

import java.util.ArrayList;

public class ObjEina {
    private int id;
    private String nom;
    private int any;
    private ArrayList<Integer> llenguatges;

    public ObjEina(int id, String nom, int any, ArrayList<Integer> llenguatges){
        this.id = id;
        this.nom = nom;
        this.any = any;
        this.llenguatges = llenguatges;
    }
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public ArrayList<Integer> getLlenguatges() {
        return llenguatges;
    }
    
    public void addLlenguatge(int id_llenguatge){
        this.llenguatges.add(id_llenguatge);
    }

    public void removeLlenguatge(int id_llenguatge){
        this.llenguatges.remove(id_llenguatge);
    }

    @Override
    public String toString() {
        return "Eina: " + this.id + " " + this.nom + ", " + this.any
        + " - " + this.llenguatges;
    }
}
