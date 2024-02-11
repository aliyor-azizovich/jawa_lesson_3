package main.clinica.core;

import main.clients.Animal;
import main.clinica.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Personal> personal;
    private List<Animal> patients;

    public Clinic() {
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void addEmployer(Personal employer) {
        personal.add(employer);
    }

    public void addPatient(Animal patient) {
        patients.add(patient);
    }

}
