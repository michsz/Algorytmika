import Algorithms.AbstractAlgorithm;
import Algorithms.BiednyCamelCase;
import Algorithms.Test;

/**
 * Created by jake on 21.07.2017.
 */
public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()){
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();

            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
