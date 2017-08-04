package Algorithms;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

/**
 * Created by RENT on 2017-08-02.
 */
public class Drzewa extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Drzewa";
    }


    String _tree[];
    int _level;
    int _height;
    @Override
    public void runAlgorithm(String[] input) {
        int n  = input.length-1;
        getLevel(n);
        _tree = new String[n];

        int i = 0;
        for (i = 0; i < n; i++){
            _tree[i] = input[i+1];
        }

        for (int j = i; j < _tree.length; j++){
            _tree[j] = "AA";
        }
        System.out.printf("Rozmiar drzewa: %d\n", _level);
        System.out.printf("Wysokosc drzewa: %d\n", _height);

        System.out.printf("Korzeniem jest: %s\n", _tree[0]);

        for(int j = 0; j < _tree.length; j++){
            String elementLewy = "";
//          String elementPrawy;
            String element = "";
            try {
                element = _tree[j];
                elementLewy = _tree[2*j+1];
//                elementPrawy = _tree[2*j+2];
            }catch (Exception ex) {
                System.out.printf("Element %s jest lisciem\n", element);
            }
        }

        getSons("A");
        getSons("E");


    }

    private void getLevel(int n){
        int currentSize = 0;
        int iterator = 0;
        do {
            currentSize = currentSize+ (int)Math.pow(2d, (double)iterator);
            iterator++;
        }while (currentSize<n);
        _level = _height = iterator - 1;
    }

    private void getSons (String father) {
        int i = 0;
        for (i = 0; i <_tree.length; i++){
            if (_tree[i].equals(father))
                break;
        }

        try{
            System.out.printf("Lewym synem elementu %s jest: %s\n", _tree[i], _tree[2*i+1]);
        } catch (Exception ex){
            System.out.printf("Element %s nie posiada syna\n", _tree[i]);
        }
    }
}
