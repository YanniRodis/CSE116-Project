package ratings;

import java.util.ArrayList;
import java.util.HashMap;


public class ProblemSet {

    // TODO: Implement this method to return the average of all the numbers in the input ArrayList
    //       If the ArrayList is empty, return 0.0
    //
    // Examples
    // [1.0,2.0,3.0] returns 2.0
    // [-5.0,5.0] returns 0.0
    // [6.5,6.5,8.5,8.5] returns 7.5
    // [] returns 0.0



    public static Double average(ArrayList<Double> numbers) {       // DOUBLE IS THE RETURN VARIABLE
        double acc = 0;
        numbers.add(1.0);
        numbers.add(2.0);       // HOW TO ADD THE NUMBERS IN LIST AS A ARGUMENT?????
        numbers.add(3.0);
        numbers.add(6.0);


        for (int num = 0; num < numbers.size(); num++) {
            //System.out.println(numbers.size());
            acc += numbers.get(num);        // gets the value at index


        }
        acc /= numbers.size();

        acc = Math.abs(acc);

        return acc;
    }

// STILL NEEDS WORK
// NEEDS CONDTIONALS

        //double x =Math.abs(-5








    // TODO: Write a public static method named sumOfDigits that takes an int as a parameter and
    //       returns the sum of the digits of the input as an int
    //
    // Examples
    // 123 returns 6
    // 57 returns 12
    // -36 returns 9
    // ONES PLACES DO NUM/10
    // ONES PLACE DO TENS%10

    public static int sumOfDigits(int sum){
        sum = Math.abs(sum);

        ArrayList<Integer> acc = new ArrayList<>();
        while (sum > 0) {       // GETS LAST DIGIT IN NUMBER AND ADDS IT TO ACC LIST, THEN RESTARTS
            acc.add(sum % 10);
            sum = sum / 10;
        }
        for (Integer value : acc) {
            sum = sum + value;

        }



        System.out.println("LIST:" + acc);
        return sum ;

        //OLD CODE
       /*kkk

          THOUSANDS
           if(sum > 1000) {
             int thousands = sum / 1000;
             acc.add(thousands);
            //System.out.println(thousands);     // get 5
            }

          if(sum > 99 ){
            int hundreds = sum / 100 ;
            acc.add(hundreds);
            //System.out.println(hundreds);
            //System.out.println(sum);



        } else if (sum < 100) {
            //get 2nd digit
            int tens = sum % 10 ;

            //System.out.println(tens);        //gets 2
            // System.out.println("test");
            acc.add(tens);

          }
*/

    }






    // TODO: Write a public static method named bestKey that takes a HashMap of String to Integer
    //       as a parameter and returns a key mapping to the largest Integer. Ties can be broken arbitrarily.
    //       If the HashMap is empty, return the empty String
    public static int bestKey(HashMap<String,Integer> map) {
        int retVal = 0;
        map.put("bills",5);
        map.put("CSE", 100);
        map.put("MTH", 90);

        //ystem.out.println(map);
        for (String key : map.keySet()) {
            int value = map.get(key);
            //System.out.println(value);
             
        }


        return retVal ;

         }


    // Examples
    // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
    // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
    // {} returns ""





    public static void main(String[] args) {
       //ArrayList<Double> numbers = new ArrayList<>();
       //System.out.println(average(numbers));

       //System.out.println( "THOUSANDS " + sumOfDigits(-123) + "\n" );
       //System.out.println( "HUNDREDS " + sumOfDigits(-57));
       //System.out.println( "HUNDREDS " + sumOfDigits(36));

        HashMap<String,Integer> map = new HashMap<>();

        System.out.println(bestKey(map));




    }


}
