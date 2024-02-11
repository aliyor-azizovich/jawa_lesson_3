package main.clinica.core.personal.impl;

import main.clients.Animal;
import main.clinica.core.personal.Personal;

import java.util.Map;

public class Doctor extends Personal {
    private final Map<Integer, String> diagnoses = Map.of(1, "лишай", 2, "чумка", 3, "бешенство");

    public String doDiagnose(Animal patient) {
        int key = (int) (1 + Math.random() * 4);
        return diagnoses.get(key);
    }
}
