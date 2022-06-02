import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println("Create a list and add 4 items.");
        // Set<Double> grades = new HashSet<>(); don't allow duplicated items, random sequence
        List<Double> grades = new ArrayList<>();
        grades.add(7.0);
        grades.add(4.5);
        grades.add(3.0);
        grades.add(8.0);
        System.out.println(grades.toString());

        System.out.println("Show the position of grade 4.5: " + grades.indexOf(4.5));

        System.out.println("Add in the list the grade 10.0 in the position 4: ");
        grades.add(4, 10.0);
        System.out.println(grades);

        System.out.println("Change the grade 3.0 by 6.0: ");
        grades.set(grades.indexOf(3.0), 6.0);
        System.out.println(grades);

        System.out.println("Check if the grade 5.0 is in the list: " + grades.contains(5.0));

        System.out.println("Show the grades in insertion sequence: ");
        for (Double grade : grades) System.out.println(grade);

        System.out.println("Show the third inserted grade: " + grades.get(2));

        System.out.println("Show the minor grade: " + Collections.min(grades));

        System.out.println("Show the major grade: " + Collections.max(grades));

        System.out.println("Show the sum of values: ");
        Iterator<Double> iterator = grades.iterator();  // ctrl+alt+v to create iterator variable
        Double sum = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;

        }
        System.out.println(sum);

        System.out.println("Show the media: " + (sum / grades.size()));

        System.out.println("Remove the grade 7.0: ");
        grades.remove(7.0);
        System.out.println(grades);

        System.out.println("Remove the grade in the position 0: ");
        grades.remove(0);
        System.out.println(grades);

        System.out.println("Remove the grades lesser than 7.0: ");
        Iterator<Double> iterator1 = grades.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(grades);

        System.out.println("Delete the list: ");
        grades.clear();
        System.out.println(grades);

        System.out.println("Check if the list is empty: " + grades.isEmpty());
    }
}
