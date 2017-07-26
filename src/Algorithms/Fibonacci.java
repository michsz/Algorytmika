package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class Fibonacci extends AbstractAlgorithm {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(fibonacci(n));
    }

    private int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
