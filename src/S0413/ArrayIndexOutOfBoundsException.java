package S0413;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();

        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);
        listOfNumbers.add(5);

        try{
            listOfNumbers.get(6);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}



