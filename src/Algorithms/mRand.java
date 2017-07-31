package Algorithms;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class mRand extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Randomowe wypelnianie tablicy";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Random mRand = new Random(12);
//        System.out.printf("%d ", mRand.nextInt());
        int[] tab = new int[20];

        for (int i = 0; i < tab.length; i++) {
            Random randomVal = new Random();
            tab[i] = randomVal.nextInt();
            System.out.println(tab[i]);

        }

        int[] parzyste = new int[10];

        int temp = 0;
        for (int i = 0; i < parzyste.length; i++) {
            parzyste[i] = temp;
            System.out.println(parzyste[i]);
            temp = temp + 2;
        }

        int[] nieparzyste = new int[10];

        temp = 1;
        for (int i = 0; i < parzyste.length; i++) {
            parzyste[i] = temp;
            System.out.println(parzyste[i]);
            temp = temp + 2;
        }


    }
}
