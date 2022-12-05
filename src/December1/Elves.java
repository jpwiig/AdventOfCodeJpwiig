package December1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Elves {
    private int totalcals =  0;
    private List<Integer>incals = new ArrayList<>();

    public Elves(List<Integer> incals) {
        this.incals = incals;
        totalcals = calculateCals();
    }

    public List<Integer> getIncals() {
        return incals;
    }

    public int getTotalcals() {
        return totalcals;
    }

    public int calculateCals() { //fix this bs
        if (incals.size() == 0) throw new IndexOutOfBoundsException("He hasnt eaten anything yet");
       int sum = 0;
        for (int i = 0; i < incals.size(); i++) {
            sum += incals.get(i);
        }
        return sum;
    }
   // public int returnSize ()
}
