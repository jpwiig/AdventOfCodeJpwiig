package December1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Elves {
    private int caloriesEeachmeal =  0;
    private List<Integer>incals = new ArrayList<>();

    public Elves(int caloriesEeachmeal) {
        this.caloriesEeachmeal = caloriesEeachmeal;
        addCals(caloriesEeachmeal);

    }

    public boolean addCals(int cals){
        List<Integer> calories = new ArrayList<>();
        if (cals == 0) throw new IllegalArgumentException("You need to eat something my guy");
        else{
            while (cals <= 0){
                calories.add(cals);
            }
        }
        return true;
    }

    //is it nessitary
/*    public int calculateCals() {
        int sum = 0;
        if (calories.size() == 0) throw new IndexOutOfBoundsException("He hasnt eaten anything yet");
        for (Integer i : calories) sum += i;
        return sum;
    }*/
   // public int returnSize ()
}