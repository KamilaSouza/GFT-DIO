package ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>() {{
            add(new Cat("Ichigo", 5, "orange"));
            add(new Cat("Simba", 18, "black"));
            add(new Cat("Frozen", 12, "white"));
        }};

        System.out.println("Cat list in insertion sequence");
        System.out.println(catList);

        System.out.println("Cat list in random sequence");
        Collections.shuffle(catList);
        System.out.println(catList);

        System.out.println("Cat list in natural sequence");
        Collections.sort(catList);
        System.out.println(catList);

        System.out.println("Cat list in age sequence");
     //   Collections.sort(catList, new AgeComparator());
        catList.sort(new AgeComparator());
        System.out.println(catList);

        System.out.println("Cat list in color sequence");
        //   Collections.sort(catList, new ColorComparator());
        catList.sort(new ColorComparator());
        System.out.println(catList);

        System.out.println("Cat list in name/color/age sequence");
        //   Collections.sort(catList, new NameColorAgeComparator());
        catList.sort(new NameColorAgeComparator());
        System.out.println(catList);

    }

}
