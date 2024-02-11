package main.drugstore;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component> , Sortable, Comparable<Pharmacy2> {
    private List<Component> components = new ArrayList<>();

    private int index = 0;

    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    public int getPowerSum() {
        int sum = 0;
        for (Component component : this.components) {
            sum += component.getPower();
        }
        return sum;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }


    @Override
    public String toString() {

        return String.format("pharmacy components : %s, count = %s, sum = %s", components, components.size(),
                this.getPowerSum());
        /** вот здесь вместо pharmacy components было бы отлично выводить наимнование самого лекарства то есть
         * переменные р1, р2, и т.д. но сколько ни копался не нашёл способа**/
    }


    @Override
    public int compareTo(Pharmacy2 sortedPharmacy) {

        int sortedPharmacySum = 0;
        int thisPharmacySum = 0;

        for (Component c : sortedPharmacy.components) {
            sortedPharmacySum += c.getPower();
        }

        for (Component c : this.components) {
            thisPharmacySum += c.getPower();
        }

        if (thisPharmacySum < sortedPharmacySum) {
            return -1;
        }
        else if (thisPharmacySum > sortedPharmacySum) {
            return 1;
        } else return 0;
    }


}