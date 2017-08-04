package Algorithms;



/**
 * Created by RENT on 2017-08-04.
 */
public class Powtorka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Powtorka";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                if (tab[i] == tab[j]) {
                    System.out.printf("Liczba co sie powtarza to %d a znajduje sie ona w indeksach %d i %d", tab[i], j, i);
                    return;
                }
        }
    }
}
