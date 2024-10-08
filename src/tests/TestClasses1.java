package tests;

import ratings.Reviewer;
import ratings.Song;
import ratings.Rating;
import  org.junit.Test;
import ratings.datastructures.LinkedListNode;

import static org.junit.Assert.*;


public class TestClasses1 {
    Rating ratingGiven = new Rating("RS", 1);


    private ratings.datastructures.LinkedListNode LinkedListNode;
    Song s1 = new Song("PF","Time","1234");
    Song s2 = new Song("PF","Time","1234");




    public void compareSongs(Song s1, Song s2) {

        assertEquals(s1.getTitle(), s2.getTitle());
        assertEquals(s1.getArtist(), s2.getArtist());
        assertEquals(s1.getSongID(), s2.getSongID());


    }
    @Test
    public void testCompareSongs() {
        compareSongs(s1, s2);
    }


    @Test
    public void testSongSetters(){ // good
        s1.setTitle("F");
        String expected = "F";
        String actual = s1.getTitle();
        assertEquals(expected, actual);



        s1.setArtist("Tme");
        String expected2 = "Tme";
        String actual2 = s1.getArtist();
        assertEquals(expected2, actual2);

        s1.setSongID("124");
        String expected3 = "124";
        String actual3 = s1.getSongID();
        assertEquals(expected3, actual3);


    }

    Rating r1 = new Rating("RS", 1);
    Rating r2 = new Rating("RS", 1);
    Rating r3 = new Rating("RS", 6);
    Rating r4 = new Rating("RS", 100);
    Rating r5 = new Rating("RS", -100);
    Rating r6 = new Rating("RS", 0);








    public void compareRatings(Rating r1, Rating r2) {
        assertEquals(r1.getReviewerID(), r2.getReviewerID());
        assertEquals(r1.getRating(), r2.getRating());

    }

    @Test
    public void testCompareRatings() {
        compareRatings(r1, r2);
    }

    @Test
    public void testRatingSetters(){ //good
        r2.setRating(5);
        int x = 5;
        int result1 = r2.getRating();
        assertEquals(x, result1);

        r2.setRating(3);
        int y = 3;
        int result2 = r2.getRating();
        assertEquals(y, result2);

        r2.setReviewerID("PF"); //good
        String expected1 = "PF";
        String Result3 = r2.getReviewerID();
        assertEquals(expected1, Result3);


        // 34 minutes in 9/25 lecture: talks about test setters
    }
    @Test
    public void testInvalidRatings(){ //good
        r1.setRating(100);
        int expected = -1;
        int result1 = r1.getRating();
        assertEquals(expected,result1);

        assertEquals(-1,r3.getRating());
        assertEquals(-1,r4.getRating());
        assertEquals(-1,r5.getRating());
        assertEquals(-1,r6.getRating());




    }




    Reviewer reviewer1 = new Reviewer("1234");
    Reviewer reviewer2 = new Reviewer("1234");
    Reviewer reviewer3 = new Reviewer("");
    Reviewer reviewer4 = new Reviewer("");
    Reviewer reviewer5 = new Reviewer(" "); 
    Reviewer reviewer6 = new Reviewer(" ");
    public void compareReviewers(Reviewer reviewer1, Reviewer reviewer2) {

        // tests if the string is the same as the other
        assertEquals(reviewer1.getReviewerID(), reviewer2.getReviewerID());
        // test if the string is empty
        assertEquals(reviewer3.getReviewerID(), reviewer4.getReviewerID());

        assertEquals(reviewer5.getReviewerID(), reviewer6.getReviewerID());


    }
    @Test
    public void testCompareReviewers() {
        compareReviewers(reviewer1, reviewer2);

    }
    @Test
    public void testReviewerSetters(){
        reviewer1.setReviewerID("123");
        String expected = "123";
        String actual = reviewer1.getReviewerID();
        assertEquals(expected, actual);

    }
    Reviewer reviewerS = new Reviewer("1234");
    @Test
    public void testReviewerRatings(){

        /*
        //Rating ratingOBJ = new Rating(reviewer1.getReviewerID(), 100);
        Reviewer reviewerGiven = new Reviewer("1234");
        Rating ratingGiven = new Rating("RS", 1)

        Rating REAL_Review = reviewerGiven.rateSong(1);

        int testVal = ratingGiven.getRating();


        assertEquals( REAL_Review.getRating(), ) ;
        */
         var actualReview = reviewerS.rateSong(100); //GOOD
          int num = actualReview.getRating();
          assertEquals(num, -1);

        var actualReview1 = reviewerS.rateSong(4);
        int num1 = actualReview1.getRating();
        assertEquals(num1, 4);

        var actualReview2 = reviewerS.rateSong(1);
        int num2 = actualReview2.getRating();
        assertEquals(num2, 1);
        assertEquals( "1234",actualReview2.getReviewerID());



    }

}

