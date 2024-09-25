package ratings;

public class Reviewer
{
    private String ReviewerID;


    public Reviewer(String ReviewerID) {
        this.ReviewerID = ReviewerID;
    }

    public String getReviewerID() {
        return ReviewerID;
    }
    public void setReviewerID(String ReviewerID) {
        this.ReviewerID = ReviewerID;

    }
    public Rating rateSong(int num){
        return new Rating(getReviewerID(), num);

    }


}


