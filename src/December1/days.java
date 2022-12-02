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
        int [] allThetotal = new int[theElves.size()];
        for (int i = 0; i < allThetotal.length; i++){
          for (int j =0; j < theElves.size(); j++)

                allThetotal[j] = theElves.get(i).calculateCals();

        }
        int max = 0;
        for (int i = 0; i < allThetotal.length; i++){
            if (allThetotal [i] > max) max = allThetotal[i];
        }
        return max;
    }
}
