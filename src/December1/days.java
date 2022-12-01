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

        for (Elves e :theElves) {
            int counter = 0;
            allThetotal [counter] = e.calculateCals();
        }
        int max = 0;
        for (int i = 0; i < allThetotal.length; i++){
            if (allThetotal [i] < max) max = allThetotal[i];
        }
        return max;
    }
}
