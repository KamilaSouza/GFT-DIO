package ordenation;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
}
