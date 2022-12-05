package December1;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class days {
    List<Elves>theElves;
    int numberOfelves  = 0;

    public days(List<Elves> theElves) {
        this.theElves = theElves;
    }

    public int findmostcal(){

                int max = 0;
      //  for (int i = 0; i < theElves.size(); i++){
        //    if (theElves.get(i).calculateCals() > max) max = theElves.get(i).calculateCals();
      //  }
        for (Elves e : theElves){
            if (e.getTotalcals() > max) max = e.getTotalcals();
       }
        return max;
    }


}
