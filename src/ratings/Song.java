package ratings;

import ratings.datastructures.LinkedListNode;

public class Song {
    private String title;
    private String artist;
    private String songID;
    private LinkedListNode addedRatings;


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
        }
        else{
            append(value,node);
        }
    }

    public void append(Rating value,LinkedListNode node) {
        if (node.getNext() == null) {
            node.setNext(new LinkedListNode<Rating>(value, null));
        } else {
            append(value, node.getNext());
        }
    }
    public LinkedListNode getRatings(){
       return  addedRatings;
    }

    public void setRatings(LinkedListNode addedRatings){
        this.addedRatings = addedRatings;
    }
 }


           // next.addRating(value);











/*
 if (this.next == null) {
            this.next = new LinkedListNode<>(value, null);
        } else {
            this.next.append(value);
        }
 */