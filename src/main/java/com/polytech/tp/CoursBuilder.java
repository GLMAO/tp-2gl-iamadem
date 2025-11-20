package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel = false;
    private String niveau = "Débutant";
    private boolean necessiteProjecteur = false;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }
    
    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }
    
    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }
    
    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }
    
    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }
    
    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }
    
    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }
    
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }
    
    public Cours build() {
        // Validation minimale - seulement les champs vraiment obligatoires
        if (matiere == null) {
            matiere = "Matière non définie";
        }
        if (enseignant == null) {
            enseignant = "Enseignant non défini";
        }
        if (salle == null) {
            salle = "Salle non définie";
        }
        if (date == null) {
            date = "Date non définie";
        }
        if (heureDebut == null) {
            heureDebut = "00:00";
        }
        
        return new Cours(matiere, enseignant, salle, date, heureDebut, estOptionnel, niveau, necessiteProjecteur);
    }
}