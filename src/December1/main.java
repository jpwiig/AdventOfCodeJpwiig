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
    while (reader.readLine() != null){
        leElfes.add(new Elves(Integer.parseInt(reader.readLine())));
    }

    }
}
