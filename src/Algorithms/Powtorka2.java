package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-04.
 */
public class Powtorka2 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Powtorka zad 2";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int toDelete = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.length-2; i++){
            list.add(Integer.parseInt(input[i+2]));
        }

        for (int i : list) {
            System.out.printf("%d ", i);
        }

        System.out.println();


        for (int i = 0; i < list.size(); i++){
            if(list.get(i).equals(toDelete)){
                list.remove(i);
                i=0;
            }
        }


        for (int i : list) {
            System.out.printf("%d ", i);
        }




    }
}
