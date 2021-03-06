package ordenation;

import java.util.Comparator;

public class ColorComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return c1.getColor().compareToIgnoreCase(c2.getColor());
    }
}
