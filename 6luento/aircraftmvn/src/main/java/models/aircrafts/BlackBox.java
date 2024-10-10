package models.aircrafts;

import java.util.Date;

public class BlackBox implements Cloneable {
    private String data;
    private Date created;

    // Constructor
    public BlackBox(String data, Date created) {
        this.data = data;
        this.created = created;
    }

    // Getters and Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    // toString method for easier printing
    @Override
    public String toString() {
        return "BlackBox{" +
                "data='" + data + '\'' +
                ", created=" + created +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

