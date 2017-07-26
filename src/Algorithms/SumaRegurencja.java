package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SumaRegurencja extends AbstractAlgorithm {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(sumaRekurencja(n));
    }

    private int sumaRekurencja(int n) {
        if (n<2)
            return 1;

        return n + sumaRekurencja(n-1);
    }

}
