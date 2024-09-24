package tests;

import ratings.Reviewer;
import ratings.Song;
import ratings.Rating;
import  org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestClasses1 {
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


    Rating r1 = new Rating("RS", 10);
    Rating r2 = new Rating("RS", 10);
    public void compareRatings(Rating r1, Rating r2) {
        assertEquals(r1.getReviewerID(), r2.getReviewerID());
        assertEquals(r1.getRating(), r2.getRating());

    }
    @Test
    public void testCompareRatings() {
        compareRatings(r1, r2);
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


}
