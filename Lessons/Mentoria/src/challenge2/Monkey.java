package challenge2;

import java.util.ArrayList;
import java.util.List;

public class Monkey {

    private String name;
    private List<String> stomach = new ArrayList<>();

    public void eat(String food) {
        if (stomach.size() == 3){
        System.out.println("Stomach full!");
    } else {
            stomach.add(food);
        }
        System.out.println(stomach);
    }

    public void digest() {
        if (stomach.isEmpty()){
            System.out.println("Empty stomach!");
        } else {
            stomach.remove(stomach.get(0));
        }
        System.out.println(stomach);
    }
}

