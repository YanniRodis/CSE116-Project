package tests;

import org.junit.Test;
import ratings.Rating;
import ratings.Song;
import ratings.datastructures.LinkedListNode;
import static org.junit.Assert.*;



public class TestDataStructures1 {

    public void compareListsOfRating() {
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

    }
    @Test
    public void TestRemoveRatingByReviewer(){

    }










    public static void main(String[] args) {
        Rating r1 = new Rating("RS", 1);
        Song s1 = new Song("PF", "Time", "1234");

        //LinkedListNode List = new LinkedListNode<>(r1, null);
        s1.addRating(new Rating("RS", 1));
        s1.addRating(new Rating("RS", 2));
        s1.addRating(new Rating("R9S", 24));
        s1.addRating(new Rating("R8S", 28));





      s1.toString();
        System.out.println(s1.toString());
    }
}
