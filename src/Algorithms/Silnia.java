package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class Silnia extends AbstractAlgorithm {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Silnia(n));
    }

    private int Silnia(int n){
        if (n < 2)
            return 1;

        return n*Silnia(n-1);
    }
}
