package ratings;

import ratings.datastructures.LinkedListNode;

public class Runner
{
    public static void main(String[] args) {
        Rating r1 = new Rating("RS", 1);
        Song s1 = new Song("PF","Time","1234");

        LinkedListNode List = new LinkedListNode<>( r1,null);
        s1.addRating(new Rating("RS", 1));
        s1.addRating(new Rating("RS", 2));



        s1.toString();



    }
}
