package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class TableMinMax extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Table Min Max";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int [] elementy = new int [input.length-1];

        for (int i = 1; i<input.length; i++){
            elementy[i-1] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i<elementy.length; i++){
            if (elementy[i]> max){
                max = elementy[i];
            }
            if (elementy[i]<min){
                min = elementy[i];
            }

        }

        for (int i = 0; i< elementy.length; i++){
            if (elementy[i] == max){
                System.out.printf("Najwyzsza liczba %d znajduje sie na pozycji %d", max, i);
                System.out.println();
            }

            if (elementy[i] == min){
                System.out.printf("Najnizsza liczba %d znajduje sie na pozycji %d", min, i);
                System.out.println();
            }

        }



    }
}
