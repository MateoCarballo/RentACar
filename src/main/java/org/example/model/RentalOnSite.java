package org.example.model;

import java.util.Date;

public class RentalOnSite extends Rental{

    private String comments;

    public RentalOnSite(Date startDate) {
        super(startDate);
    }

    public RentalOnSite(Date startDate, Date endDate, String comments) {
        super(startDate, endDate);
        this.comments=comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
