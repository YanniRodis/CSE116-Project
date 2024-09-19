package tests;

import org.junit.Test;
import ratings.ProblemSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestProblemSet {

    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class

    @Test
    public void testaverage() {                         // GOOD!!!!!!!!!!!!!!!!!!!!!!
        ArrayList<Double> testList = new ArrayList<>(Arrays.asList(2.0,3.0,5.0,10.0,50.0,167.0));
        assertEquals(ProblemSet.average(testList), 39.5, 0.001);

        ArrayList<Double> testList1 = new ArrayList<>(Arrays.asList(4.0));
        assertEquals(ProblemSet.average(testList1), 4.0, 0.001);

        ArrayList<Double> testList2 = new ArrayList<>(Arrays.asList(-4.0,5.0));
        assertEquals(ProblemSet.average(testList2), 0.5, 0.001);

        ArrayList<Double> testList3 = new ArrayList<>(Arrays.asList(1000.0,20000.0,0.30000));
        assertEquals(ProblemSet.average(testList3), 7000.1, 0.001);

        ArrayList<Double> testList4 = new ArrayList<>(Arrays.asList(4557.0,-7998.0,7658.0));
        assertEquals(ProblemSet.average(testList4), 1405.66667, 0.001);






    }
    @Test
    public void testsumOfDigits() { //                              GOOD!!!!!!!!!!!!!

        assertTrue(ProblemSet.sumOfDigits(123)==6);
        assertTrue(ProblemSet.sumOfDigits(-1000)==1);
        assertTrue(ProblemSet.sumOfDigits(-1)==1);
        assertTrue(ProblemSet.sumOfDigits(-54)==9);
        assertTrue(ProblemSet.sumOfDigits(0)==0);
        assertTrue(ProblemSet.sumOfDigits(128984849)==53);



    }

    @Test
    public void testbestKey(){
        HashMap<String,Integer> testMap1 = new HashMap<>();
        testMap1.put("CSE",2000);
        testMap1.put("MTH",1000);
        testMap1.put("MGS",100);
        testMap1.put("SEAS",9400);


        assertEquals(ProblemSet.bestKey(testMap1),"SEAS");


        HashMap<String,Integer> testMap2 = new HashMap<>();
        testMap2.put("CSE",-2000);
        testMap2.put("MTH",-1000);
        testMap2.put("MGS",-100);
        testMap2.put("SEAS",-9400);


        assertEquals(ProblemSet.bestKey(testMap2),"MGS");




        HashMap<String,Integer> testMap3 = new HashMap<>();
        assertEquals(ProblemSet.bestKey(testMap3),"");
    }
}


//hashmap

//AssertEquals("STRING/KEY",HashMap)
