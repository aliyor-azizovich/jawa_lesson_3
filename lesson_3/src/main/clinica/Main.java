package main.clinica;

import main.clients.Animal;
import main.clinica.core.Clinic;
import main.clinica.core.personal.Personal;
import main.clinica.core.personal.impl.Doctor;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        System.out.println(clinic.getPatients());
        System.out.println(clinic.getPersonal());


        Doctor doctor = new Doctor();
        clinic.addEmployer(doctor);
    }
}
