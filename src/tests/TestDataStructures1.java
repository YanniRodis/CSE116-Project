package tests;

import org.junit.Test;
import ratings.Rating;
import ratings.Reviewer;
import ratings.Song;
import ratings.datastructures.LinkedListNode;
import static org.junit.Assert.*;



public class TestDataStructures1 {

    public void compareListsOfRatings() {
        Rating ratingObject = new Rating("131", 1);
        LinkedListNode<Rating> LinkedListOfRatings1 = new LinkedListNode<>(ratingObject, null);
        LinkedListNode<Rating> LinkedListOfRatings2 = new LinkedListNode<>(ratingObject, null);

        assertEquals(
                LinkedListOfRatings1.getValue().getRating(),
                LinkedListOfRatings2.getValue().getRating()
        );

        assertEquals(
                LinkedListOfRatings1.getValue().getReviewerID(),
                LinkedListOfRatings2.getValue().getReviewerID()
        );


    }

    @Test
    public void TestAverageRating(){
        Rating r1 = new Rating("RS", 1);
        Song s1 = new Song("PF", "Time", "1234");

        //LinkedListNode List = new LinkedListNode<>(r1, null);
        s1.addRating(new Rating("FIRSTNODE", 1));
        s1.addRating(new Rating("SECONDNODE", 2));
        s1.addRating(new Rating("THIRDNODE", 3));
        s1.addRating(new Rating("FOURTHNODE", 8));




        //s1.addRating(r1); // no errors so far

        s1.averageRating(); // get stack overflow error

        s1.removeRatingByReviewer(new Reviewer("THIRDNODE"));

        //System.out.println(s1.averageRating());
        //System.out.println(s1);
    }
    @Test
    public void TestRemoveRatingByReviewer(){

    }











}
