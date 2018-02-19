package com.csc680.orbit.model.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

    @Id
    private int ticketID;
    private String name;
    private String description;
    private String priority;
    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User user;

    public Ticket() {

    }

    public Ticket(int ticketID, String name, String description, User user) {
        this.ticketID = ticketID;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public Ticket(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID=" + ticketID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", user=" + user +
                '}';
    }
}

