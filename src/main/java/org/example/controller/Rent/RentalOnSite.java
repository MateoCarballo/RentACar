package org.example.controller.Rent;

import java.util.Date;

public class RentalOnSite extends Rent{

    String comments;

    public RentalOnSite(Date startDate, Date endDate, String comments) {
        super(startDate, endDate);
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
