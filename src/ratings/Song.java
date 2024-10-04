package ratings;

import ratings.datastructures.LinkedListNode;

import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private String songID;
    private LinkedListNode<Rating> addedRatings; //CHANGED THE TYPE TO Rating


    public Song(String title, String artist, String songID, LinkedListNode addedRatings) {// THIS IS THE CONSTRUCTOR

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
        LinkedListNode node = new LinkedListNode<>(value, null);//creates new node
        LinkedListNode HeadNode = new LinkedListNode(value, node);

        if (this.addedRatings == null) {
            this.addedRatings = node; // assigns the first node to the linkedlist
        } else {
            append(value, node);
        }
    }

    public void append(Rating value, LinkedListNode node) {
        if (node.getNext() == null) {
            node.setNext(new LinkedListNode<Rating>(value, null));
        } else {
            append(value, node.getNext());
        }
    }

    public LinkedListNode getRatings() {
        return this.addedRatings;
    }

    public void setRatings(LinkedListNode addedRatings) {
        this.addedRatings = addedRatings;

    }

    public Double averageRating() {
        ArrayList<Rating> ListOfRatings = new ArrayList();    // ARRAYLIST OF RATING OBJECTS
        ArrayList<Integer> Average = new ArrayList();    // ARRAYLIST OF RATING OBJECTS
        int counter = 0; //counts the number of times
        double addedValues = 0; // adds together all rating values


        LinkedListNode node = new LinkedListNode<>(addedRatings.getValue(), null);//creates new node
        //addedRatings IS THE LINKEDLIST

        LinkedListNode HeadNode = new LinkedListNode(addedRatings.getValue(), node);
        //.getValue GETS THE RATING OBJECT FROM THE lINKED lIST


        if (this.addedRatings == null) {
            this.addedRatings = node; // assigns the first node to the linkedlist
        } else {
            ListOfRatings.add(addedRatings.getValue());
            //append(value, node);
        }

        for (Rating ratingObject : ListOfRatings) { // for each ratingObject in a ListOfRatings
            int ratingValue = ratingObject.getRating(); //GETS the Rating value from the ratingObject

            if ((ratingValue >= 1 && ratingValue <= 5)) { //checks if it is a valid rating
                Average.add(ratingValue);  //adds the value from the ratingObject to the AverageList
                counter += 1;
            }

        }
        for (int value : Average) {
            addedValues += value;
        }


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
        if (addedRatings == null) {
            return 0.0;
        } else {
            return addedValues / counter;
        }


    }

    public void removeRatingByReviewer(Reviewer reviewer){
        LinkedListNode node = new LinkedListNode<>(addedRatings.getValue(), null);//creates new node
        LinkedListNode HeadNode = new LinkedListNode(addedRatings.getValue(), node);


    }
    public int size() {
        if (addedRatings.getNext() == null) {
            return 1;
        } else {

            return 1 + size();
        }
    }
}









    /*public void setAddedRatings(LinkedListNode addedRatings) {
        this.addedRatings = addedRatings;

    }*/
/*
    public Double averageRating() {
        ArrayList<Rating> RatingsArray = new ArrayList<>();
        ArrayList<Double> Average = new ArrayList<>();
        Double count = 0.0;



        //LinkedListNode node = new LinkedListNode(this.addedRatings.getValue(),null);
        LinkedListNode node = new LinkedListNode(this.addedRatings.getValue(), addedRatings.getNext());

        LinkedListNode HeadNode = new LinkedListNode, node);


        while (node.getNext() != null) {

            RatingsArray.add(addedRatings.getValue());
            //HOW TO GET THE INT VALUE FROM THE addedRatings LIST TO THE ARRAYLIST,INSTEAD OF THE WHOLE NODE

        }

        if(RatingsArray.size() ==0) {
            return 0.0;
        }
        else{
            for(() : RatingsArray){
                Average.add(node.getValue());
                count = count + node.getValue();    // Not sure how to get the rating value from addedRatings as a integer

                return count / LLsize();

            }

        }


    }

    public int LLsize() { //HELPER METHOD
        if (this.addedRatings.getNext() == null) {
            return 1;
        } else {
            return 1 + LLsize();
        }
    }












    public void navigate(LinkedListNode node) {
        // for ( node : addedRatings){

    }



}






           // next.addRating(value);












 if (this.next == null) {
            this.next = new LinkedListNode<>(value, null);
        } else {
            this.next.append(value);
        }
 */