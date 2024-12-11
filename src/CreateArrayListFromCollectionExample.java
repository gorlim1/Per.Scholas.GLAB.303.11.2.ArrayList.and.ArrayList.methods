import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {

        List<Integer> firstFivePrimeNumbers = new ArrayList<>();

        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        System.out.println("firstFivePrimeNumbers: " + firstFivePrimeNumbers);


        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        System.out.println("firstTenPrimeNumbers: " + firstTenPrimeNumbers);


        List<Integer> nextFivePrimeNumbers = new ArrayList<>();

        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        System.out.println("nextFivePrimeNumbers: " + nextFivePrimeNumbers);


        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println("firstTenPrimeNumbers: " + firstTenPrimeNumbers);
    }
}