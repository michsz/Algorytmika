package Algorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Sortowanie przez zliczanie";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length-2;
        int[] tab = new int[n];

        for (int i = 0; i<n; i++){
            tab[i] = Integer.parseInt(input[i+2]);
        }

        int[] sort = new int[Integer.parseInt(input[1])+1];

        for (int i = 0; i<tab.length;i++){
            int liczba = tab[i];
            sort[liczba]++;

        }

        for (int i = 0; i <sort.length; i++){
            if(sort[i]!=0) {
                for (int liczbaWystapien = sort[i]; liczbaWystapien > 0; liczbaWystapien--) {
                    System.out.printf("%d ", i);
                }
            }


        }

    }
}
