package ratings;

import ratings.datastructures.LinkedListNode;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private String songID;
    private LinkedListNode<Rating> addedRatings; //CHANGED THE TYPE TO Rating


    public Song(String title, String artist, String songID, LinkedListNode<Rating> addedRatings) {// THIS IS THE CONSTRUCTOR

        this.title = title;
        this.artist = artist;
        this.songID = songID;
        this.addedRatings = addedRatings;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
        //return title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongID() {
        return this.songID;

    }

    public void setSongID(String songID) {
        this.songID = songID;


    }

    public void addRating(Rating value) {
        LinkedListNode<Rating> node = new LinkedListNode<>(value, null);//creates new node
        //LinkedListNode<Rating> HeadNode = new LinkedListNode(value, node);

        if (this.addedRatings == null) {
            this.addedRatings = node; // assigns the first node to the linkedlist
        } else {
            append(value, node);
        }
    }

    public void append(Rating value, LinkedListNode<Rating> node) {
        if (node.getNext() == null) {
            node.setNext(new LinkedListNode<>(value, null));
        } else {
            append(value, node.getNext());
        }
    }

    public LinkedListNode<Rating> getRatings() {
        return this.addedRatings;
    }

    public void setRatings(LinkedListNode<Rating> addedRatings) {
        this.addedRatings = addedRatings;

    }

    public double averageRating() {


        // LinkedListNode<Rating> node = new LinkedListNode<>(addedRatings.getValue(), null);//creates new node
        //addedRatings IS THE LINKEDLIST


        if (addedRatings == null) {
            return 0.0;
        } else {
            return addRatingValues(addedRatings.getValue().getRating(), addedRatings.getNext()) / SizeOfaddedRatings(addedRatings.getValue().getRating(), addedRatings.getNext());
        }
    }


    public int addRatingValues(int RatingsValues, LinkedListNode<Rating> node) {
        if (node.getNext() == null) {
            //node.setNext(new LinkedListNode<Rating>(addedRatings.getValue(), null));
            RatingsValues = addedRatings.getValue().getRating();
            return RatingsValues;
        } else {
            return addedRatings.getValue().getRating() + addRatingValues(RatingsValues, node.getNext());

        }

    }

    public int SizeOfaddedRatings(int value, LinkedListNode<Rating> node) {      // gets the size of the linkedlist
        if (node.getNext() == null) {
            return 1;
        } else {
            return 1 + SizeOfaddedRatings(value, node.getNext());
        }

    }


//        ADD THE VALUE FROM THE RATING OBJECT TO TEH ARRAYLIST
//
//        for (Rating ratingObject : ListOfRatings) { // for each ratingObject in a ListOfRatings
//            int ratingValue = ratingObject.getRating(); //GETS the Rating value from the ratingObject
//
//            if ((ratingValue >= 1 && ratingValue <= 5)) { //checks if it is a valid rating
//                Average.add(ratingValue);  //adds the value from the ratingObject to the AverageList
//                counter += 1;
//            }
//
//
//
//
//    HOW TO SET NEXT TO THE NEXT NODE,AND THEN
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        while (addedRatings.getNext() != null){
//            ListOfRatings.add(addedRatings.getValue()); // adds the rating object to the Linked list
//
//        }
//        for(Rating ratingObject: ListOfRatings){ // for each ratingObject in a ListOfRatings
//            int ratingValue =ratingObject.getRating(); //GETS the Rating value from the ratingObject
//
//            if ((ratingValue >= 1 && ratingValue <= 5)){ //checks if it is a valid rating
//                Average.add(ratingValue);  //adds the value from the ratingObject to the AverageList
//                counter += 1;
//            }
//
//        }
//        for( int value: Average){
//            addedValues += value;
//        }
//


    public void removeRatingByReviewer(Reviewer reviewer) {
        //LinkedListNode node = new LinkedListNode<>(addedRatings.getValue(), null);//creates new node
        //LinkedListNode HeadNode = new LinkedListNode(addedRatings.getValue(), node);




    }


    public void deleteNode(Reviewer reviewer){
        if(Objects.equals(addedRatings.getValue().getReviewerID(), reviewer.getReviewerID())){


        }

    }
}
//delete headnode,lastnode,and middle


//    public void addRatingValues(, LinkedListNode node) {
//        if (node.getNext() == null) {
//            node.setNext(new LinkedListNode<Rating>(value, null));
//        } else {
//            add(value, node.getNext());
//        }
//    }


//    public void size(Rating value ,LinkedListNode node) {
//        if (node.getNext() == null) {
//            node.setNext(new LinkedListNode<Rating>(addedRatings.getValue(), null));
//        } else {
//            size(addedRatings.getValue(), node.getNext());
//        }
//    }










//
//    /*public void setAddedRatings(LinkedListNode addedRatings) {
//        this.addedRatings = addedRatings;
//
//    }*/
///*
//    public Double averageRating() {
//        ArrayList<Rating> RatingsArray = new ArrayList<>();
//        ArrayList<Double> Average = new ArrayList<>();
//        Double count = 0.0;
//
//
//
//        //LinkedListNode node = new LinkedListNode(this.addedRatings.getValue(),null);
//        LinkedListNode node = new LinkedListNode(this.addedRatings.getValue(), addedRatings.getNext());
//
//        LinkedListNode HeadNode = new LinkedListNode, node);
//
//
//        while (node.getNext() != null) {
//
//            RatingsArray.add(addedRatings.getValue());
//            //HOW TO GET THE INT VALUE FROM THE addedRatings LIST TO THE ARRAYLIST,INSTEAD OF THE WHOLE NODE
//
//        }
//
//        if(RatingsArray.size() ==0) {
//            return 0.0;
//        }
//        else{
//            for(() : RatingsArray){
//                Average.add(node.getValue());
//                count = count + node.getValue();    // Not sure how to get the rating value from addedRatings as a integer
//
//                return count / LLsize();
//
//            }
//
//        }
//
//
//    }
//
//    public int LLsize() { //HELPER METHOD
//        if (this.addedRatings.getNext() == null) {
//            return 1;
//        } else {
//            return 1 + LLsize();
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//    public void navigate(LinkedListNode node) {
//        // for ( node : addedRatings){
//
//    }
//
//
//
//}
//
//
//
//
//
//
//           // next.addRating(value);
//
//
//
//
//
//
//
//
//
//
//
//
// if (this.next == null) {
//            this.next = new LinkedListNode<>(value, null);
//        } else {
//            this.next.append(value);
//        }
// */