package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class DzialkaJasia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int[] tab = new int[n];

        if (input.length - 2  == tab.length) {

            for (int i = 2; i < input.length; i++) {
                int temp = Integer.parseInt(input[i]);
                System.out.println((int)Math.pow(temp, 2));

            }

        } else {
            System.out.println("Za duzo danych");
        }

    }
}
