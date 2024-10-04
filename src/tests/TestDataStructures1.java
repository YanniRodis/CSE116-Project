package tests;

import org.junit.Test;
import ratings.Rating;
import ratings.datastructures.LinkedListNode;
import static org.junit.Assert.*;



public class TestDataStructures1 {

    public void compareListsOfRating(){
        Rating ratingObject = new Rating("131",1);
        LinkedListNode<Rating> LinkedListOfRatings1 = new LinkedListNode<>(ratingObject,null);
        LinkedListNode<Rating> LinkedListOfRatings2 = new LinkedListNode<>(ratingObject,null);

        assertEquals(
                LinkedListOfRatings1.getValue().getRating(),
                LinkedListOfRatings2.getValue().getRating()
        );

        assertEquals(
                LinkedListOfRatings1.getValue().getReviewerID(),
                LinkedListOfRatings2.getValue().getReviewerID()
        );

    }
}
