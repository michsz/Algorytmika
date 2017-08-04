import Algorithms.*;


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
            case "sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case "odejmowaniekwoty":
                return new OdejmowanieKwoty();
            case "sumaliczbwejsciowych":
                return new SumaLiczbWejsciowych();
            case "rokprzestepny":
                return new RokPrzestepny();
            case "silnia":
                return new Silnia();
            case "sumarekurencja":
                return new SumaRegurencja();
            case "wyznaczanie":
                return new Wyznaczanie();
            case "fibonacci":
                return new Fibonacci();
            case "szyfrcezara":
                return new SzyfrCezara();
            case "bubblesort":
                return new Bubble();
            case "palindrome":
                return new Palindrome();
            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPuntu();
            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();
            case "krzyzowka":
                return new Krzyzowka();
            case "dzialkajasia":
                return new DzialkaJasia();
            case "wielkanoc":
                return new Wielkanoc();
            case "nwd":
                return new NajwiekszyWspolnyDzielnik();
            case "random":
                return new mRand();
            case "tableminmax":
                return new TableMinMax();
            case "testlist":
                return new Listy();
            case "drzewa":
                return new Drzewa();
            case "powtorka":
                return new Powtorka();
            case "powtorka2":
                return new Powtorka2();
            default:
                throw new Exception("Nie ma takiego algorytmu!");
        }
    }
}
