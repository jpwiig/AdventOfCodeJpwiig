package December1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Elves {
    private int caloriesEeachmeal =  0;
    private List<Integer>incals = new ArrayList<>();

    public Elves(List<Integer> incals) {
        this.incals = incals;
    }

   public int calculateCals() { //fix this bs
        int sum = 0;
        if (incals.size() == 0) throw new IndexOutOfBoundsException("He hasnt eaten anything yet");
        for (Integer i : incals) sum += i;
        return sum;
    }
   // public int returnSize ()
}
