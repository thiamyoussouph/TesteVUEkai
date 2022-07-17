package com.vukai.projectevuekai.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Vehicules {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Matricule",unique = true,length = 20)
    private String Matricule;
    private String Modele;
    private String photo;
    private int NombrePlace;
    private Date DateSortie;
    private Date DateMiseEnMarche;
    private boolean Etats;
    private boolean active ;

    public Vehicules() {
    }

    public Vehicules(String matricule, String modele, String photo, int nombrePlace, Date dateSortie, Date dateMiseEnMarche, boolean etats, boolean active) {
        Matricule = matricule;
        Modele = modele;
        this.photo = photo;
        NombrePlace = nombrePlace;
        DateSortie = dateSortie;
        DateMiseEnMarche = dateMiseEnMarche;
        Etats = etats;
        active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        Modele = modele;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getNombrePlace() {
        return NombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        NombrePlace = nombrePlace;
    }

    public Date getDateSortie() {
        return DateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        DateSortie = dateSortie;
    }

    public Date getDateMiseEnMarche() {
        return DateMiseEnMarche;
    }

    public void setDateMiseEnMarche(Date dateMiseEnMarche) {
        DateMiseEnMarche = dateMiseEnMarche;
    }

    public boolean isEtats() {
        return Etats;
    }

    public void setEtats(boolean etats) {
        Etats = etats;
    }

    public boolean isActive() {
        return active;
    }

    public void setStatuts(boolean statuts) {
        active = active;
    }
}

