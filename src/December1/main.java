package December1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("src/December1/data/Data.txt");
        BufferedReader reader = new BufferedReader(f);
        List<Elves> leElfes = new ArrayList<>();
        List<Integer> dats = new ArrayList<>();

        String line = reader.readLine();


       while (line != null) {

               dats.clear();
               while (!line.isEmpty()) {

                   dats.add(Integer.parseInt(line));
                   line = reader.readLine();

               }
               line = reader.readLine();
               leElfes.add(new Elves(dats));

       }
       reader.close();
               days day = new days(leElfes);
        System.out.println(day.findmostcal());
    }
}