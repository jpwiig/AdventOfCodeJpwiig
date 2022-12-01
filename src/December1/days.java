package December1;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class days {
    List<Elves>theElves;
    int numberOfelves  = 0;
    public days(int numberOfelves){
        this.numberOfelves = numberOfelves;
        theElves  = new ArrayList<>(this.numberOfelves);
    }
    public void adddays(){
    for (Elves e: theElves) theElves.add(e);
    }
}
