package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class Listy extends AbstractAlgorithm {



    @Override
    public String getName() {
        return "Test listy";
    }

    @Override
    public void runAlgorithm(String[] input) {
        ArrayList<String> kolory = new ArrayList<>();

        kolory.add("czerwony");
        kolory.add("niebieski");
        kolory.add("zolty");

        for (int i = 0; i < kolory.size(); i++){
            System.out.println(kolory.get(i));
        }
    }


}
