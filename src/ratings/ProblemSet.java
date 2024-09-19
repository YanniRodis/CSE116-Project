package ratings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class ProblemSet {

    // TODO: Implement this method to return the average of all the numbers in the input ArrayList
    //       If the ArrayList is empty, return 0.0
    //
    // Examples
    // [1.0,2.0,3.0] returns 2.0
    // [-5.0,5.0] returns 0.0
    // [6.5,6.5,8.5,8.5] returns 7.5
    // [] returns 0.0



    public static double average(ArrayList<Double> numbers) {       // DOUBLE IS THE RETURN VARIABLE
        double acc = 0.0;

        if (numbers.isEmpty()) {
            return 0.0;
        }

        for (int num = 0; num < numbers.size(); num++) {
            //System.out.println(numbers.size());
            acc += numbers.get(num);        // gets the value at index


        }
        acc /= numbers.size();

        acc = Math.abs(acc);

        return acc;
    }

// SHOULD WORK CORRECTLY










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
    public static String bestKey(HashMap<String,Integer> map) {
        int retVal = Integer.MIN_VALUE;
        int neg = 99999;

        String KEY = "";

        //ArrayList<Integer> values = new ArrayList<>(map.values());


        for (String key : map.keySet()) {
            int value = map.get(key);

            //if ((value >  retVal)  ){
            if ((value >  retVal) ){

                    retVal = value;
                    KEY = key;



            }



        }


        return  KEY   ;

         }


// NEED TO BE ABLE TO PUT THE RETURN STATEMENT SOMEWHERE

    // Examples
    // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
    // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
    // {} returns ""





    public static void main(String[] args) {
       ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(2.0));

       //System.out.println(average(numbers));

       //System.out.println( "THOUSANDS " + sumOfDigits(0) + "\n" );
       //System.out.println( "HUNDREDS " + sumOfDigits(-57));
       //System.out.println( "HUNDREDS " + sumOfDigits(36));

        HashMap<String,Integer> map = new HashMap<>();

        System.out.println(bestKey(map));




    }


}
