package main.drugstore;

import main.drugstore.components.Analgesic;
import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Dragmain {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component analgesic = new Analgesic("Analgesic", 12D, 21);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronite);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicillin, water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        Pharmacy2 p4 = new Pharmacy2();
        p4.addComponents(azitronite,analgesic);

        Pharmacy2 p5 = new Pharmacy2();
        p5.addComponents(water, analgesic);

        Pharmacy2 p6 = new Pharmacy2();
        p6.addComponents(analgesic, analgesic);

        List<Pharmacy2> pharmacys = new ArrayList<>();
        pharmacys.add(p5);
        pharmacys.add(p4);
        pharmacys.add(p3);
        pharmacys.add(p6);
        pharmacys.add(p1);

        pharmacys.add(p2);

//

        for (Pharmacy2 pharmacy : pharmacys) {
            System.out.println(pharmacy);

        }

           Collections.sort(pharmacys);
        System.out.println(
                "Отсортированный список"
        );

        for (Pharmacy2 pharmacy : pharmacys) {
            System.out.println(pharmacy);
        }



//        List<Component> components = new ArrayList<>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//
//
//        System.out.println(components);
//        Collections.sort(components);
//        System.out.println(components);
//        Collections.sort(components, Comparator.reverseOrder());

//        System.out.println(components);

//        Iterator<Component> iterator = p2;

//        while (iterator.hasNext()){
//            System.out.println(p1.next().toString());
//        }
//        for (Component c : p2){
//            System.out.println(c);
//        }
    }
}
