package com.csc680.orbit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Student 
{
    @Id
    private int id;
    private String firstName, lastName;
    private String imageURL;
 
    public Student() {}
 
    public Student(String firstName, String lastName, int id) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.imageURL = "http://via.placeholder.com/400x400";
    }
    
    public int getId() {  return id;   }
 
    public void setId(int id) {  this.id = id;   }
    
    public String getfirstName() {  return firstName;  }
 
    public void setfirstName(String firstName) {this.firstName = firstName;}
    
    public String getlastName() {  return lastName;  }
 
    public void setlastName(String firstName) {this.lastName = lastName;}

    public String getImageURL() {return imageURL;}

    public void setImageURL(String imageURL) {this.imageURL = imageURL;}

    @Override
    public String toString() 
    {
        return "Pose [id=" + id + ", name=" + firstName+lastName + 
               ", imageURL=" + imageURL + "]";
    }
}