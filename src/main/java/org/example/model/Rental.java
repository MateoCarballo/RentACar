package org.example.model;

import java.util.Date;

public abstract class Rental {

    private Date startDate;
    private Date endDate;

    public Rental(Date startDate) {
        this.startDate = startDate;
    }

    public Rental(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
