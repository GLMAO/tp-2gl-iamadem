package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // Les cours en ligne peuvent avoir une durée différente
        return coursDecorated.getDuree(); // Même durée par défaut
    }
}