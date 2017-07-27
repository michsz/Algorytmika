package Algorithms;

import javax.sound.midi.Soundbank;

/**
 * Created by RENT on 2017-07-26.
 */
public class Bubble extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] tab = new int[input.length-1];

        for (int i = 0; i<input.length-1; i++){
            tab[i] = Integer.parseInt(input[i+1]);
            }


        int n=tab.length;
        int temp=0;
        for(int i=0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (tab[j] > tab[j+1]) {
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }

        for(int i= 0; i < tab.length;i++)
            System.out.println(tab[i]);

    }
}
