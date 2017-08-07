package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Krzyzowka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Krzyzowka";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        String literki[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        double bok = Math.sqrt(n);

        if (bok%1==0 && bok<literki.length){
            int x = (int)bok;
            String[][] kwadrat = new String[x][x];
            for (int i = 0; i<x; i++){
                for(int j = 0; j<x; j++){
                    kwadrat[i][j] = literki[i] + String.valueOf(j+1);
                }
            }

            for (int i = 0; i<x; i++){

                for (int j = 0; j<x; j++){
                    System.out.printf("%s ", kwadrat[i][j]);
                }
                System.out.println(" ");
            }




        } else {
            System.out.println("No can do mate");
        }

    }
}
