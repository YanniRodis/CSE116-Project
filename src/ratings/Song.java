package ratings;

import ratings.datastructures.LinkedListNode;

import java.util.Objects;

public class Song {
    private String title;
    private String artist;
    private String songID;
    private LinkedListNode<Rating> addedRatings; //CHANGED THE TYPE TO Rating


    public Song(String title, String artist, String songID) {// THIS IS THE CONSTRUCTOR

        this.title = title;
        this.artist = artist;
        this.songID = songID;
        //this.addedRatings = addedRatings;

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

    public void addRating(Rating value) { //SHOULD BE WORKING BECAUSE THE NEXT PARAM CHANGES IN THE DEBUGGER

//               LinkedListNode<Rating> node = new LinkedListNode<Rating>(value,null);//creates new node
//               LinkedListNode<Rating> HeadNode = new LinkedListNode(value, node);
//
//        while (addedRatings != null){
//            addedRatings = addedRatings.getNext();
//
//        }
//    addedRatings.setNext(node);


        LinkedListNode<Rating> node = new LinkedListNode<>(value,null);//creates new node
        //LinkedListNode<Rating> HeadNode = new LinkedListNode(value, node);

        if (addedRatings == null) {            //IF WERE AT THE LAST/HEAD NODE
            this.addedRatings= node; // assigns the first node to the linkedlist

        } else {
            //node = this.addedRatings
            append(value,node) ;

        }
    }

    public void append(Rating value, LinkedListNode<Rating> node) {
        if (node.getNext() == null) {
            addedRatings.setNext(new LinkedListNode<>(value, this.addedRatings));
        } else {
            append(value, this.addedRatings);
        }

    }
;

    public LinkedListNode<Rating> getRatings() {
        return this.addedRatings;
    }

    public void setRatings(LinkedListNode<Rating> addedRatings) {
        this.addedRatings = addedRatings;

    }

    public double averageRating() {

        //addedRatings IS THE LINKEDLIST

        //JUST CALL THE HELPER METHOD

        return AverageHelper(addedRatings, 0.0, 0);
    }

           // return _averageRating(this.addedRatings) /   SizeOfaddedRatings( this.addedRatings );

    //}

    public double AverageHelper(LinkedListNode<Rating> node, double sum ,int size){

        if(node == null){


            //need base case
           //null is not at the last value for some reason

            if (size== 0){
                return size;
            }
            else{
                return sum / size; //ONLY HAPPENS WHEN IT REACHS THE END OF THE LIST.

            }

        } else{
            if (node.getValue().getRating() >= 1 && node.getValue().getRating() <= 5) {
                // skip this node


                sum += node.getValue().getRating();    //adds all the values together
                size++; //get the count
            }
        }
        return AverageHelper(node.getNext(),sum,size);

    }
//    public double _averageRating(LinkedListNode<Rating> currentnode) {    //Helper for averageRating
//        //currentnode = this.addedRatings;
//
//
//        if (currentnode == null) {
//            //node.setNext(new LinkedListNode<Rating>(addedRatings.getValue(), null));
//            return 0.0;
//        } else {
//            if(this.addedRatings == null){ // if addedratings is null, make addedratings = currentnode, and then set the Next value to to the currentnode
//
//                this.addedRatings = currentnode;    //DOES THIS ONLY ONCE
//                //this.addedRatings.setNext(currentnode);
//                //sets addedratings as the next node    just keeps setting the node to the same node. loops on itself
//
//                //IF HEADNODE = NULL, HEADNODE IS NOW THE CURRENT NODE
//                this.addedRatings.setNext(currentnode);         //sets addedratings as the next node    just keeps setting the node to the same node. loops on itself
//
//            }
//            //this.addedRatings.setNext(currentnode);         //sets addedratings as the next node    just keeps setting the node to the same node. loops on itself
//
//            // adds up all the rating values
//            double total = currentnode.getValue().getRating() + _averageRating(currentnode);
//            return total;
//
//
//
//
//
//
//
//        }
//
//        //cannot call .get next when the node is null
//    }

    public int SizeOfaddedRatings( LinkedListNode<Rating> node) {       //Helper for averageRating
        if (node == null) {                                             // gets the size of the linkedlist
            return 1;
        } else {
            return 1 + SizeOfaddedRatings( node.getNext());
        }

    }




    public void removeRatingByReviewer(Reviewer reviewer) {
        //LinkedListNode node = new LinkedListNode<>(addedRatings.getValue(), null);//creates new node
        //LinkedListNode HeadNode = new LinkedListNode(addedRatings.getValue(), node);
        _deleteNode(addedRatings,addedRatings.getNext(), reviewer);






    }


    public void _deleteNode(LinkedListNode<Rating> previousNode, LinkedListNode<Rating> currentNode, Reviewer reviewer){ //helper
        //previousNode IS THE HEAD NODE technically

        if (currentNode != null) {
            if( Objects.equals(addedRatings.getValue().getReviewerID(), reviewer.getReviewerID() ) ) {   //if the RATING OBJECT reviewerid == reviewerID
                currentNode = addedRatings.getNext();   //gets the current nodes reference
                previousNode = addedRatings;  //gets the previous nodes reference
                previousNode.setNext(currentNode);  //sets the previous nodes reference TO the current node reference


            }
            else {
                _deleteNode(previousNode,currentNode,reviewer);
            }
        }

//
//
//        }

    }
    public String toString() {
    LinkedListNode<Rating> node = new LinkedListNode<>( addedRatings.getValue(),null);
        String out = "";
        out += node.getValue();
        if (node.getNext() != null) {
            out += " " + "->"+ node.getNext().toString();
        }
        return out;
    }
}
//delete headnode,lastnode,and middle



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