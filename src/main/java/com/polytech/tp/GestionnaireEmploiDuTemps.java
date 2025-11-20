package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observateurs = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (!observateurs.contains(o)) {
            observateurs.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observateurs.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observateur : observateurs) {
            observateur.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // Notification directe du message sans préfixe
        notifyObservers(message);
    }

    public void annulerCours(ICours cours) {
        if (listeCours.remove(cours)) {
            System.out.println("Cours annulé : " + cours.getDescription());
            notifyObservers("Cours annulé : " + cours.getDescription());
        }
    }

    public void setChangement(String message) {
        System.out.println("Changement : " + message);
        // CORRECTION : Envoyer le message DIRECT sans préfixe
        notifyObservers(message);
    }
    
    // Méthode utilitaire pour les tests
    public List<ICours> getListeCours() {
        return new ArrayList<>(listeCours);
    }
}