package Algorithms;

/**
 * Created by RENT on 2017-08-09.
 */
public class NajwiekszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Najmniejsza wspolna wielokrotnosc";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        System.out.println(NWW(k, n));

    }

    int NWD(int k, int n) {
        if (k == 0) {
            return n;
        } else {
            return NWD(n % k, k);
        }
    }

    int NWW (int k, int n){
        return (k*n)/NWD(k,n);
    }
}
